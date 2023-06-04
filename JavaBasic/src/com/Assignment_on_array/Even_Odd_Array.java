package com.Assignment_on_array;

import java.util.Arrays;
import java.util.Scanner;

public class Even_Odd_Array 
{
			public void evenOdd(int a[])
			{
				int ecount=0;
				int ocount=0;
				
				for(int i=0; i<a.length; i++)
				{
					if(a[i]%2==0)
					{
						ecount++;
					}
					else
					{
						ocount++;
					}
				}
				int b[]=new int[ecount];
				int c[]=new int[ocount];
				int k=0; 
				int t=0;
				for(int j=0;j<a.length;j++)
				{
					if(a[j]%2==0)
					{	
						b[k]=a[j];
						k++;
					}
					else
					{
						c[t]=a[j];
						t++;
					}
				}
				System.out.println("Even Elements: ");	
				System.out.println(Arrays.toString(b));
				System.out.println("Odd Elements: ");
				System.out.println(Arrays.toString(c));
				
			}
			
	
			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size of array");
				int n=sc.nextInt();
				int a[]=new int[n];
				System.out.println("Enter the elements");
				for(int i=0; i<a.length; i++)
				{
					a[i]=sc.nextInt();
				}
				
				Even_Odd_Array e=new Even_Odd_Array();
				e.evenOdd(a);
				
			}
			
}
