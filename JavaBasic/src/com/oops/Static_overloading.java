package com.oops;



public class Static_overloading 
{
	public static void calculate(int x,int y)
	{
		System.out.println("Addition = "+(x+y));
	}
	
	public static void calculate(int p, int q, int r)
	{
		System.out.println("Multiplication = "+(p*q*r));
	}
	
	public static void calculate()
	{
		
		System.out.println("hiiii");
	}
	
	public static void main(String name, int marks)
	{
		System.out.println("Name = "+name+" Marks = "+marks);
	}
	
	public static void main(String[] args) {
		Static_overloading.calculate(10, 20);
		Static_overloading.calculate(10, 10, 10);
		Static_overloading.calculate();
		Static_overloading.main("Vijay", 77);
		
	 
	}

	
}
