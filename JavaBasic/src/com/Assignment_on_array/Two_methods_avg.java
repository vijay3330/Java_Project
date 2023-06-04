package com.Assignment_on_array;

import java.util.Scanner;

public class Two_methods_avg 
{
				
				public static int avg(int a[])
				{
					int sum=0;
					
					for(int j=0; j<a.length ; j++)
					{
						sum=sum+a[j];
					}
					
					int avg=sum/a.length;
					System.out.println("int method avg= "+avg);
					return avg;
				}
				
				public static double avg(double b[])
				{
					double sum=0;
					
					for(int j=0; j<b.length ; j++)
					{
						sum=sum+b[j];
					}
					
					double avg=sum/b.length;
					System.out.println("int method avg= "+avg);
					return avg;
				}
	
				
				public static void main(String[] args) 
				{
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter the int elements");
					int a[]=new int[4];
					for(int i=0 ; i<a.length ; i++)
					{
						a[i]=sc.nextInt();
					}
					
					System.out.println("Enter the double elements");
					
					double b[]= new double[4];
					for(int i=0 ; i<b.length ; i++)
					{
						b[i]=sc.nextDouble();
					}
					
					avg(a);
					avg(b);
					
				}
}
