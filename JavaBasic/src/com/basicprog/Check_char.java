package com.basicprog;

import java.util.Scanner;

public class Check_char {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Char");
		
		char ch=sc.next().charAt(0);
		System.out.println(ch);
		
		if(ch>='A' && ch<='Z')
		{
			ch= (char)(ch+32);
		}
		else if(ch>='a' && ch<='z')
		{
			ch= (char)(ch-32);	
		}
		else
		{
			ch=ch;
		}
		System.out.println();

	}

}
