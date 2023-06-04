package com.Assignment_on_array;

import java.util.Arrays;
import java.util.Scanner;

public class Copy_Array 
{
			public void copyArray(int a[])
			{
				int b[]=new int[a.length];
				
				for(int i=0;i<a.length;i++)
				{
					b[i]=a[i];
				}
				System.out.println(Arrays.toString(b));
			}
			
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("ENter the Elements");
			int a[]=new int [5];
			
			for(int i=0;i<a.length;i++)
			{
				 a[i]=sc.nextInt();
			}
			
			System.out.println(Arrays.toString(a));
			
			Copy_Array c=new Copy_Array();
			c.copyArray(a);
			
			
			
		}
	
	
}
