package com.exceptionhandling;

import org.junit.gen5.api.Test;

class InvalidBinary extends RuntimeException
{
	public InvalidBinary()
	{
		super();
	}
	
	public InvalidBinary(String msg)
	{
		super(msg);
	}
}



public class CustException
{
			
			public static void checkBinary(int num)
			{
				boolean isbinary = true;
				
				while(num>0)
				{
					int digit = num%10;
					num = num/10;
					if(digit ==0 || digit == 1)
					{
						continue;						
					}
					else 
					{
						isbinary = false;
						break;
					}
				}
				
				if(isbinary==false)
				{
					throw  new InvalidBinary("Number not Binary");
				}
				else
				{
					System.out.println("number is correct.....");
				}
			}
			
			
			public static void main(String[] args) 
			{
				try
				{
					CustException.checkBinary(1141);
				}
				catch(InvalidBinary e)
				{
						System.out.println(e);
				}
				System.out.println("Done...");
				
				
				
			}
			
}
