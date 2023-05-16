package com.oops;

public class Accessmodifieredemo {

	public static void main(String[] args) 
	{
		
		Accessmodifiers a1=new Accessmodifiers();
	  // System.out.println(a1.x); // error
		// a1.pmethod(); // error
		System.out.println(a1.y);	//default
		System.out.println(a1.z);	//protected
		
		
	}

}
