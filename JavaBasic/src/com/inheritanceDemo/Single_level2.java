package com.inheritanceDemo;

class Colors
{
	String colorname;
}

class Red extends Colors
{
	public void showColor()
	{
		colorname="Red";
		System.out.println(colorname+" "+" is a color");
	}
}

public class Single_level2 
{
	
	public static void main(String[] args) 
	{
		Red r=new Red();
		r.showColor();
	}
	
}
