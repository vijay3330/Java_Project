package com.exceptionhandling;

public class CheckException 
{
		
		public static void showConnection() throws ClassNotFoundException
		{
			Class.forName("com.jdbc.driver");
		}
	
	
	
		public static void main(String[] args)
		{
				try
				{
					showConnection();
				}
				catch(ClassNotFoundException e)
				{
					System.out.println(e);
				}
				System.out.println("hiii");
		}
	
}
