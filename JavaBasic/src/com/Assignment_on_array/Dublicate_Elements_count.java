package com.Assignment_on_array;

import java.util.Arrays;
import java.util.Scanner;

public class Dublicate_Elements_count 
{
				public static void duplicate(int a[])
				{
					System.out.println(Arrays.toString(a));
					for(int i=0; i<a.length; i++)
					{
						int count=1;

							for(int j=i+1; j<a.length; j++)
							{
								if(a[i]==a[j])
								{
									count++;
								}
							}
							if(count>1)
							{
								System.out.println(" Element "+a[i]+"= "+count+" times");	
							}
						
					}
				}
				
					
				public static void main(String[] args) 
				{
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter the size of the arry");
					int size=sc.nextInt();
					int a[]=new int[size];
					System.out.println("Enter the Elements of the array");
					for(int i=0; i<a.length; i++)
					{
						a[i]=sc.nextInt();
					}
					
					duplicate(a);
					
				}
	
	
	
}
