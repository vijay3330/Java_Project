package com.arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Even_Elements 
{

	public static void findEven(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
			
		}
		
		System.out.println("---------------------");
		
		for(int x : a)
		{
			if(x %2==0)
			{
				System.out.println(x);
			}
		}
	}
	
	
	
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array element");
		
		int a[]= new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		System.out.println(Arrays.toString(a));
		
		Find_Even_Elements.findEven(a);
	}
	
	
	
}
