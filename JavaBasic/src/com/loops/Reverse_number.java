package com.loops;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args)
	{
		// Reverse number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int rev=0;
		
		while(num>0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
			
		}
		System.out.println(rev);

	}

}
