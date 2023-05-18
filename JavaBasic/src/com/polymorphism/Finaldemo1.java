package com.polymorphism;

public class Finaldemo1 
{
		
	final int z; //blank final variable
	
	public Finaldemo1()
	{
		z=33;
	}
	
	public void show()
	{
		System.out.println(z);
	}
	
	public static void main(String [] args)
	{
		Finaldemo1 f1=new Finaldemo1();
		System.out.println(f1.z);
		f1.show();
				
	}
}
