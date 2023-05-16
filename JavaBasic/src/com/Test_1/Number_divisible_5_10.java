package com.Test_1;


public class Number_divisible_5_10 {

	/*1)Write a program to print all numbers between 1 and 100 except
	the numbers which are divisible by 5or 10 */
	public static void main(String[] args) 
	{
		
		
		for(int i=1;i<=100;i++)
		{
			if(i%5==0 || i%10==0)
			{
				continue;
			}
			else
			{
				System.out.println(i);
			}
		}
		

	}

}
