package com.algo;

import java.util.Scanner;

public class Number_Divisibleby_5_and_11 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		
		int number=sc.nextInt();
		
		if((number%5==0) && (number%11==0))
		{
			System.out.println("Number is divisible by 5 and 11");
		}
		else
		{
			System.out.println("Number is not divisible by 5 and 11");
		}

	}

}
