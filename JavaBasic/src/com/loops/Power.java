package com.loops;

import java.util.Scanner;

public class Power {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base");
		int base=sc.nextInt();
		System.out.println("Enter the exponent");
		int expo=sc.nextInt();
		int pwr=1;
		
		for(int i=1;i<=expo;i++)
		{
			pwr=pwr*base;
			
		}
		System.out.println(pwr);
		
	}

}
