package com.polymorphism;

public class Final_with_block_initilizer 
{

	final int x;
	
	{
		x=30;
	}
	
	public void show()
	{
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		Final_with_block_initilizer f=new Final_with_block_initilizer();
		f.show();
	}
	
	
}
