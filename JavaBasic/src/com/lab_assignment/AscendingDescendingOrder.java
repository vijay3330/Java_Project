package com.lab_assignment;

import java.util.Scanner;

public class AscendingDescendingOrder
{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of an Array");
			int size=sc.nextInt();
			
			if(size <= 0)
			{
				System.out.println("Array size should be greater than 0");
			}
			
			int a[] =new int [size];
			System.out.println("Enter the array elements");
			for(int i=0; i<a.length; i++)
			{
				a[i]=sc.nextInt();
			}
			
			int n=a.length;
			int temp;
			for(int i=0;i < n-1;i++)
		     {
		        for(int j = 0;j < n/2; j++) 
		        { 
		        	if(a[j]>a[j+1])
		            {
		              temp=a[j];
		              a[j]=a[j+1];
		              a[j+1]=temp;
		            }
		        }

		        for(int j = n/2;j < n-1; j++)
		        {
		            if(a[j] < a[j+1])
		            {
		               temp=a[j];
		               a[j]=a[j+1];
		               a[j+1]=temp;
		            }
		         }
		      }

		      for(int i = 0; i < n; i++)
		         System.out.print(a[i] + " ");
		}
		
		
		
		
		
}
		
	
	
	
	
	
	

