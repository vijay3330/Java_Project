package com.exceptionhandling;

public class PropagateUncheck 
{
		
			public void m1()
			{
				
				throw new NullPointerException("Null value");
			}
			
			public void n1()
			{
				try
				{
					m1();
				}
				catch(NullPointerException e)
				{
					System.out.println("n1");
				}
			}
			
			public void p1()
			{
				n1();
			}
			
			
			public static void main(String[] args) 
			{
				
				PropagateUncheck p=new PropagateUncheck();
				p.p1();
				System.out.println("hii");
				
			}
}
