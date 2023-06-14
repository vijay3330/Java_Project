package com.wrapper;

public class BoxingDemo 
{
		
		public static void main(String[] args)
		{
			int i=20;
			
			Integer obj=new Integer(i); //Boxing
			
			Integer obj2=i; //autoBoxing
			
			int num=obj.intValue();// unboxing
			int num2=obj; //auto unboxing 
		}
			
		
}
