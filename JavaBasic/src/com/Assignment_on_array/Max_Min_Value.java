package com.Assignment_on_array;

import java.util.Scanner;

public class Max_Min_Value 
{
			public void maxMin(int a[])
			{	
				int max=a[0];
				for(int i=0; i < a.length ; i++)
				{
						if(max<a[i])
						{
							max=a[i];
						}
				}
				System.out.println("Max Element = "+max);
				int min=a[0];
				for(int j=0;j<a.length;j++)
				{
					if(min>a[j])
					{
						min=a[j];
					}
				}	
				System.out.println("Min Element = "+min);
			}
	
			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size of array");
				int size=sc.nextInt();
				int a[]=new int[size];
				System.out.println("Enter the elements");
				for(int i=0;i<a.length;i++)
				{
					a[i]=sc.nextInt();
				}
				
				Max_Min_Value m=new Max_Min_Value();
				m.maxMin(a);
				
				
			}	
			
}
