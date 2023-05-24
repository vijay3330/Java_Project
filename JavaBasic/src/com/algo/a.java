package com.algo;

import java.util.Scanner;

public class a {

	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			//int num=sc.nextInt();
//		for(int i=1;i<=num;i=(i*2)+1)
//		{
//			
//			System.out.println(i);
//		}		
				int num=1;
				int input=10;
			for(int i=1; i<=100;i++)
			{
				
				num=(num+i) - 1;
				
				if(input==i)
					System.out.println(num);
			}
		
		
		
	

	}

}
