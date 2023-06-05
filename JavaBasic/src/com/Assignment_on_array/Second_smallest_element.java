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
					if(min<a[i])
					{
						min=a[i];
						b[i]=min;
					}
				}
				System.out.println(Arrays.toString(a));
				System.out.println(Arrays.toString(b));
				System.out.println(min);
				
			}
	
			
			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size of array");
				int size=sc.nextInt();
				int[] a=new int[size];
				System.out.println("Enter the elements");
				System.out.println(a.length);
				for(int i=0; i< a.length ; i++)
				{
					a[i]=sc.nextInt();
				}
				System.out.println("Hiii");
				System.out.println(Arrays.toString(a));
				smallest(a);
								
			}
				
}
