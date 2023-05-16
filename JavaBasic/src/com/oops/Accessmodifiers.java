package com.oops;

public class Accessmodifiers 
{

	private int x=10;
	int y=20; 
	
	protected int z=30;
	
	
	
	private void pmethod()
	{
		System.out.println("hello");
	}
	
	public static void main(String[] args) 
	{
		  Accessmodifiers a=new Accessmodifiers();
		  System.out.println(a.x);
		  a.pmethod();
		  System.out.println(a.y);
		  System.out.println(a.z);

	}

}
