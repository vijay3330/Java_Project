package com.loops;

import java.util.Scanner;

public class Primenumber_bywhile {

	public static void main(String[] args) 
	{
				// check prime num or not 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int i=2;  	//initial condition
		
		boolean isprime= true;
		
		
		while(i<num)
		{
			if(num%i==0)
			{
				isprime=false;
				break;
			}
			
			i++;
			
		}
		if(isprime)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not prime");
		}

	}

}
