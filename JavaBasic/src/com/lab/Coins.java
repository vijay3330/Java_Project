package com.lab;

import java.util.Scanner;

public class Coins {

	/*
	 * 2)Each birthday, Meenu’s parents gift her gold coins. On her 1st birthday she got one coin from them, 2nd birthday 8 coins, 
3rd birthday 27 coins, 4th birthday 64 coins, 5th birthday 125 coins and so on. 
Meenu is now 10 years old. Given her age, help her calculate how many coins she can get for that birthday.

Note : Age should be a valid positive number(>0). Incase of any invalid input, the output should be "Invalid Age".

	 */
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		int coins=age*age*age;
		
		System.out.println("Meenu gets "+coins+" Coins on "+age+" birthday..."+"\n Happy Birthady Meenu..");
		
	}

}
