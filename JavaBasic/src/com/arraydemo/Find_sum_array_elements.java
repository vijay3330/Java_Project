package com.arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class Find_sum_array_elements 
{

	public static void findSum(int a[])
	{	int sum=0;
		for(int i=0; i<a.length;i++)
		{
			
			sum=sum+a[i];
		}
		System.out.println("Sum: "+sum);
	}
	
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		
		int a[] = new int[5];
		
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		System.out.println("------------------------");
		
		Find_sum_array_elements.findSum(a);
		
		
	}
	
	
	
}
