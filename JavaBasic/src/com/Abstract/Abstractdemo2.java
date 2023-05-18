package com.Abstract;

abstract class A
{
	int x=10;
	abstract void add();
}

abstract class B extends A
{
	int y=20;
	abstract void show();
}

class Mathss extends B
{
	int z;
	
	 void add()
	{
		  z=x+y;
	}
	
	void show()
	{
		System.out.println(z);
	}
}

public class Abstractdemo2 
{

	
	public static void main(String[] args) {
		
		Mathss m=new Mathss();
		m.add();
		m.show();
		
	}
}
