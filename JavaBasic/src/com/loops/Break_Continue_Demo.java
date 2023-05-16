package com.loops;

public class Break_Continue_Demo {

	public static void main(String[] args) 
	{
//		for(int i=1;i<=5;i++)
//		{
//			if(i%3==0)
//			{
//				break;
//			}
//			System.out.println(i);
//		}
		
		for(int i=1;i<=6;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
