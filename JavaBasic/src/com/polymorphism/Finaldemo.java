package com.polymorphism;

public class Finaldemo 
{
		 final int x;
		
	    public Finaldemo()
		{
			x=20;	// final variable initilize only once
		}
		
		public void show()
		{
			System.out.println(x);
		}
		
		public static void main(String[] args)
		{
			Finaldemo f=new Finaldemo();
	//		System.out.println(x);			can not use non static instance in static 	
			System.out.println(f.x);
			f.show();
		}
		
}
