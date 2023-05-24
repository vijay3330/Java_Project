package com.arraydemo;

import java.util.Scanner;

public class Find_Prime_Number 
{

	public static void findPrime(int a[])
	{
		
		int sum=0;
		for(int i=0; i<a.length;i++)
		{	
			boolean isprime=true;
			int n=a[i];
			for(int j=2;j<n;j++) {
			if(n%j==0)
			{
				isprime=false;
				break;
			}
			}
			if(isprime)
			{
				System.out.println(a[i]);
				sum=sum+n;
			}
		}System.out.println(sum);
		
	}
	
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Elements");
		
		int a[] = new int [6];
		
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("---------------------");
		
		Find_Prime_Number.findPrime(a);
		
		
	}
	
	
	
}
