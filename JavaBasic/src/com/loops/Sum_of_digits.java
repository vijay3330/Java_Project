package com.loops;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args)
	{
		// find the sum of digits from number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		int rem;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		System.out.println(sum);

	}

}
