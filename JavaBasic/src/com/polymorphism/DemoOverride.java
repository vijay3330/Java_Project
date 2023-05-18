package com.polymorphism;

class Animals
{
	public void run()
	{
		System.out.println("Animal running........");
	}
}

class Dogs extends Animals
{
	
	public void run()
	{
		System.out.println("Dog is running....");
	}
}

class Cat extends Animals
{
	public void run()
	{
		System.out.println("Cat is running.....");
	}
}

public class DemoOverride 
{
		// Dynamic Methood Dispatch decide at runtime which obj is call
	public static void main(String[] args) {
		// parent refrance child obj for dynamic dispatch
		Animals a=new Dogs();
		a.run();
		
		
		
	}
	
}
