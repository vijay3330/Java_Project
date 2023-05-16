package com.basicprog;

import com.oops.Accessmodifiers;

public class DemoAccess extends Accessmodifiers
{

	public static void main(String[] args) 
	{
		Accessmodifiers a2=new Accessmodifiers();
	//	System.out.println(a2.y); //error default other pckg
		
		DemoAccess d=new DemoAccess();
		System.out.println(d.z);
		
	}

}
