package com.algo;

import java.util.Scanner;

public class Min_Number {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter num1");
		
		int num1=sc.nextInt(); 
		
		System.out.println("Please enter num2");
		
		int num2=sc.nextInt();
		
		if(num1<num2)
		{
			System.out.println("num1 is minimum number");
		}
		else if(num1>num2)
		{
			System.out.println("num2 is minimum number");
		}
		else
		{
			System.out.println("both numbers are equal");
		}
		
	}

}
