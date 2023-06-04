package com.Assignment_on_array;

import java.util.Arrays;
import java.util.Scanner;

public class Display_Negative_Elements 
{
			
	
			public void negativeEle(int a[])
			{
				System.out.println(Arrays.toString(a));
				int count=0;
				
				for(int i=0; i<a.length; i++)
				{	
					if(a[i]<0)
					{
				    	count++;
				    	
					}
					
				}
				int b[]=new int[count];
				int k=0;
				for(int j=0; j<a.length; j++)
				{
					if(a[j]<0)
					{
				    	b[k]=a[j];
				    	k++;
					}
				}
				
				System.out.println("Negative Elements count = "+count);
				System.out.println(Arrays.toString(b));
			}
				
	
			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size of array");
				int n=sc.nextInt();
				int a[]=new int[n];
				System.out.println("Enter the elements of array");
				
				for(int i=0; i<a.length; i++)
				{
					a[i]=sc.nextInt();
				}
				
				Display_Negative_Elements d=new Display_Negative_Elements();
				d.negativeEle(a);
				
				
				
			}
}
