package com.switchcase;

import java.util.Scanner;

public class String_Switchcase {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.next();
		
		switch(str)
		{
			case "Happy" :	System.out.println("happy");
			
			
			case "New" :	System.out.println("new");
			
			
			case "Year" :	System.out.println("year");
			break;
			
			case "Welcome" :System.out.println("welome");
			break;
		}
		
		
		

	}

}
