package com.Assignment_on_array;

import java.util.Arrays;
import java.util.Scanner;

public class Insert_Element 
{		
		
		
			
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of Array");
			int n=sc.nextInt();
			int a[] = new int[n+1];
			System.out.println("Enter the elements of array");
			for(int i=0; i<n ; i++)
			{
				a[i]=sc.nextInt();
			}
			
			System.out.println("Enter the position where you want to insert element");
			int pos=sc.nextInt();
			
			System.out.println("Enet the element you want to insert");
			int e=sc.nextInt();
			
			for(int i=(n-1); i>=(pos-1); i--)
			{
				a[i+1]=a[i];
			}
			
			a[pos-1]=e;
			
			System.out.print("After inserting: ");
			
			System.out.println(Arrays.toString(a));
			
			
			
		}
		
	
}
