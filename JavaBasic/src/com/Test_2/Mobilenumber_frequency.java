package com.Test_2;

import java.util.Scanner;

public class Mobilenumber_frequency {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile number");
		long mob=sc.nextLong();
		int count=0;
		long digit =0;
		int i=0;
		long copy;
		
		for(i=0;i<=9;i++)
		{
			copy=mob;
			count=0;
		
		while(copy>0)
		{
			digit=copy%10;
			if(i==digit)
			{
				count++;
			}
			
			copy=copy/10;
		}
		System.out.println(i+"count= "+count);
		
	}
	
	}
}
	
