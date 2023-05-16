package com.loops;

import java.util.Scanner;

public class Digit_count {

	public static void main(String[] args) 
	{
		// Digit_count  1234  
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int count=0;
		int rev=0;
		while(num>0) 
		{
			int digit=num%10;
			rev =rev*10+digit;
		     count++;
			num=num/10;
			
		}
		System.out.println(count);
		
			
		

	}

}
