package com.loops;

import java.util.Scanner;

public class Avg_Digit {

		//Avg of digits
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int avg=0;
		int sum=0;
		int rev=0;
		int count=0;
		
		while(num>0)
		{
			int digit =num%10;
			sum=sum+digit;
			count++;
			num=num/10;
			
			avg=(sum)/count;
			
		}
		System.out.println(avg);
		

	}

}
