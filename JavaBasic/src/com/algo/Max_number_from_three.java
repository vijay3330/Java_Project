package com.algo;

import java.util.Scanner;

public class Max_number_from_three {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please enter num1:");
		
		int num1=sc.nextInt();
		
		System.out.println("Please enter num2:");
		
		int num2=sc.nextInt();
		
		System.out.println("Please enter num3:");
		
		int num3=sc.nextInt();
		
		if(num1>=num2 && num1>=num3)
		{
			System.out.println( num1+ " is the max number:");
		}
		else if(num2>=num1 && num2>=num3)
		{
			System.out.println( num2+ " is the max number:");
		}
		else
		{
			System.out.println( num3+ " is the max number:");
		}

	}

}
