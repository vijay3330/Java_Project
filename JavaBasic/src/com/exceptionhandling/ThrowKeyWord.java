package com.exceptionhandling;

public class ThrowKeyWord 
{
		
		public static void isvalid(int age)
		{
			
			
				if(age < 18)
				{
					throw new ArithmeticException("Invalid age");
				}
				else
				{
					System.out.println("Valid");
				}
			
			
		}
		
		public static void main(String[] args) 
		{
			
				try
				{
					isvalid(12);
					
				}
				catch(ArithmeticException e)
				{
					System.out.println(e);
				}
				System.out.println("Done");
			
		}
}
