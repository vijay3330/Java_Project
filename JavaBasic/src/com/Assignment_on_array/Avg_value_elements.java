package com.Assignment_on_array;

import java.util.Arrays;
import java.util.Scanner;

public class Avg_value_elements 
{			
			public void avgElements(int a[])
			{
				int count=0;
				int sum=0;
				for(int i=0; i<a.length ; i++)
				{
					count++;
				}
				System.out.println(count);
				for(int j=0; j<a.length ; j++)
				{
					sum=sum+a[j];
				}
				
				int avg= sum/count;
				
				System.out.println("Avg of array Element= "+avg);
			}
		
			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the Dimension of array");
				int size=sc.nextInt();
				int a[]=new int[size];
				System.out.println("Enter the elements");
				
				for(int i=0 ; i<a.length ; i++)
				{
					a[i]= sc.nextInt();
							
				}
				
				System.out.println(Arrays.toString(a));
				
				Avg_value_elements e=new Avg_value_elements();
				e.avgElements(a);
				
			}
	
}
