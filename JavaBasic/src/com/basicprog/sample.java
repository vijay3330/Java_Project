package com.basicprog;

import java.util.Scanner;

public class sample 
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number 1");
			int num1=sc.nextInt();
			boolean isprime=true;
			int i=2;
			char ch='y';
			
			do {
			while(i<num1)
			{
				if(num1%i==0)
				{
					isprime=false;
					break;
				}
				i++;
			}
			if(isprime)
			{
				System.out.println("Number is prime number");
			}
			else
			{
				System.out.println("Number is not prime number");
				break;
			}
			
			System.out.println("do you want cantinue");
			
			
			}while(ch=='y'||ch=='Y');
		}
}
