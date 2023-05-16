package com.switchcase;

import java.util.Scanner;

public class Day 
{
//	Write a program to take day number from user as input and display respected day name using switch case	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		switch (num) 
		{
		case 1:
			System.out.println("MONDay");
			break;

		case 2:
			System.out.println("TUESDAY");
			break;

		case 3:
			System.out.println("WENSDAY");
			break;

		case 4:
			System.out.println("THURSDAY");
			break;

		case 5:
			System.out.println("FRIDAY");
			break;

		case 6:
			System.out.println("SATURDAY");
			break;

		case 7:
			System.out.println("SUNDAY");
			break;

		default:
			System.out.println("invalid number");

		}

	}

}
