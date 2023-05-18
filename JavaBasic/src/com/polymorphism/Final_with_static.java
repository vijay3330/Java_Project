package com.polymorphism;

public class Final_with_static 
{
		
	static final int v;
	
	static
	{
		v=28;
	}
	
	public void show()
	{
		System.out.println(v);
	}
	
	public static void main(String[] args) {
		
		Final_with_static F=new Final_with_static();
		
		System.out.println(F.v);
		
		F.show();
		
	}
	
}
