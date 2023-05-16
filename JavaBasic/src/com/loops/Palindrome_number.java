package com.loops;

import java.util.Scanner;

public class Palindrome_number {

	public static void main(String[] args) 
	{
		// palindrome number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int rev=0,num1;
		num1=num;
		
		while(num>0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;  
		}
		System.out.println(rev);
		if(num1==rev)
		{
			System.out.println(num1+ " Number is palindrome number");
		}
		else
		{
			System.out.println(num1+ " Number is not palindrome number");
		}
		

	}

}
