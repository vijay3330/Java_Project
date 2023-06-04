package com.exceptionhandling;

public class Test 
{
		
				
				public static void main(String[] args) 
				{
					System.out.println("hiiiii");
					
					try
					{
						int x=10/0;
						System.out.println(x);
					}
					catch(ArithmeticException e)
					{
						System.out.println(e);
					}
					System.out.println("Welcome Java");
				}
	
	
}
