package com.arraydemo;

import java.util.Scanner;

public class Odd_Elements 
{
		public static void findOdd(int a[])
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2 != 0)
				{
					System.out.println(a[i]);
				}
			}
		}
	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the elements");
			int a[] = new int[5];
			for(int i=0; i<a.length; i++)
			{
				a[i]=sc.nextInt();
			}
			
			System.out.println("-----------------------");
			Odd_Elements.findOdd(a);
			
		}
	
	
}
