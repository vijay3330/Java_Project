package com.exceptionhandling;

public class FinallyDemo 
{

			public static void main(String[] args) 
			{
				try
				{
					System.out.println(10/0);
				}
				catch(ArithmeticException e)
				{
					System.out.println(e.getMessage());
				}
				finally
				{
					System.out.println("Finally Block");
				}
			}
	
	
}
