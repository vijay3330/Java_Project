package com.loops;

public class Series4 {

	public static void main(String[] args)
	{
		// 1 8 9 64 25
		
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.print(i*i*i+ " ");
				
			}
			else
			{
				System.out.print(i*i+" ");
			}
		}

	}

}
