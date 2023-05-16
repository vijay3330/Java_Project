package com.inheritanceDemo;

class Mobile
{
	String storage="128 GB";
	public void calling()
	{
		System.out.println("Mobile is use for caling");
	}
}
class Oneplus extends Mobile
{
	String storage="256 GB";
	public void showOneplus()
	{
		super.calling();
		System.out.println(storage+" "+super.storage);
		super.calling();
		
	}
	
	public void calling()
	{
		super.calling();
		System.out.println("Oneplus is better for video calls");
	}
	
}

public class Super_Keyword_Demo 
{

	public static void main(String[] args) {
		Oneplus o=new Oneplus();
		o.showOneplus();
		o.calling();
				
	}
	
}
