package com.loops;

public class Num_11to25 {

	public static void main(String[] args) 
	{
		
//		for(int i=12; i<=24 ; i++)
//		{
//			System.out.println(i);
//		}
		
//		for(int i=425; i>=300; i--)
//		{
//			System.out.println(i);
//		}
			
//		for(int i=1;i<=10;i++)
//		{
//			if(i%2!=0)
//			{
//				System.out.println(i);
//			}
//		}
		
		
//		int sum=0;
//		for(int i=1;i<=20;i++)
//		{
//			if(i%2!=0)
//			{
//				sum++;
//			}
//		}
//		System.out.println(+sum+ " odd numbers in 1 to 20");
		
		int sum=0;
		for(int i=1; i<=20; i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
	}
	
	

}
