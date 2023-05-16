package com.basicprog;

import java.util.Scanner;

public class Demo2 
{
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter num1");
			int num1=sc.nextInt();
			
			
			if(num1 % 3==0 || num1 % 9 == 0)
			{
				System.out.println("number is divisible by 3 or 9");
				
			}
			else
			{
				System.out.println("number is not divisible by 3 or 9");
			}
		}
}
