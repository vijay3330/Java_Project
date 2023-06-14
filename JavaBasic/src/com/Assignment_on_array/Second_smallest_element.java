package com.Assignment_on_array;

import java.util.Arrays;
import java.util.Scanner;

public class Second_smallest_element 
{
			public static void smallest(int a[])
			{	
				int min=a[0];
				int b[]=new int[a.length];
				for(int i=0; i<a.length; i++)
				{
					if(min>a[i])
					{
						min=a[i];
						
					}
					b[i]=min;
				}
				
				
				System.out.println("Second Smallest Number: "+b[1]);
				
			}
	
			
			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size of array");
				int size=sc.nextInt();
				int[] a=new int[size];
				System.out.println("Enter the elements");
				for(int i=0; i< a.length ; i++)
				{
					a[i]=sc.nextInt();
				}
				smallest(a);
								
			}
				
}
