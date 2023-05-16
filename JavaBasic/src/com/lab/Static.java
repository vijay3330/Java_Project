package com.lab;

public class Static 
{
			static int a=100;
			
			int b=200;
			
			public static void m1()
			{
			//	System.out.println(b);
				System.out.println(a);
			}
			
			public void m2()
			{
				System.out.println(b);
				System.out.println(a);
			}
	
		public static void main(String[] args) {
			
			m1();
			System.out.println(a);
			
			Static s=new Static();
			s.m2();
			 
		}
	
}
