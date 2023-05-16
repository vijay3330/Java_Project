package com.basicprog;

import java.util.Scanner;

public class Variables 
{

//	int a2;
//	int $123;
//	char ch$1;
//	float pa_value;
//	double _netsal;
//	double *nm;
//	boolean 1flag;
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		int year=sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println("year is a leap year");
		}
		else
		{
			System.out.println("year is not a leap year");
		}
		
		
	}
	
}
