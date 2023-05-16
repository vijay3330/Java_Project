package com.basicprog;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) 
	{
		Scanner	sc=new Scanner(System.in);
		System.out.println("Enter your age ");
		int myage=sc.nextInt();
		System.out.println("Enter your friend age");
		int frndage=sc.nextInt();
		
		if(myage > frndage)
		{
			System.out.println("Hii");
			
		}
		else if(frndage > myage)
		{
			System.out.println("Hello");

		}
		else
		{
			System.out.println("How are you");
		}

	}

}
