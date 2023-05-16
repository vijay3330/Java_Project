package com.switchcase;

import java.util.Scanner;

	// Write a Java program print total number of days in a month using switch case
public class Number_of_days_in_month 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month");
		int month = sc.nextInt();
		System.out.println("Enter the year");
		int year = sc.nextInt();				
		int Number_of_days=0;
		String Month_name="Unknown";
		
		switch(month)
		{
			case 1: 
				Month_name="January";
				Number_of_days=31;
				break;
				
			case 2:
				Month_name="February";
				if(year%4==0 ||(( year%400==0) && (year % 100 != 0)))
				{
					Number_of_days=29;
				}
					Number_of_days=28;
				break;
				
			case 3:
				Month_name="March";
				Number_of_days=31;
				break;
				
			case 4:
				Month_name="April";
				Number_of_days=30;
				break;
				
			case 5:
				Month_name="May";
				Number_of_days=31;
				break;
				
			case 6:
				Month_name="Jun";
				Number_of_days=30;
				break;
				
			case 7:
				Month_name="July";
				Number_of_days=31;
				break;
				
			case 8:
				Month_name="August";
				Number_of_days=31;
				break;
				
			case 9:
				Month_name="September";
				Number_of_days=30;
				break;
				
			case 10:
				Month_name="October";
				Number_of_days=31;
				break;
				
			case 11:
				Month_name="November";
				Number_of_days=30;
				break;
				
			case 12:
				Month_name="December";
				Number_of_days=31;
				break;
				
			default :
				System.out.println("invalid input");
				
				
		}
		 System.out.print(Month_name + " " + year + " has " + Number_of_days + " days");
		
		
		
		 	
		 
	}

}
