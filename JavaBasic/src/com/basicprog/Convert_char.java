package com.basicprog;

import java.util.Scanner;

public class Convert_char {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		
		if(ch=='A'-'Z' || ch =='a'-'z')
		{
			System.out.println("Char is alphabet");
		}
		else 
		{
			System.out.println("Char is Spcial symbol");
		}

	}

}
