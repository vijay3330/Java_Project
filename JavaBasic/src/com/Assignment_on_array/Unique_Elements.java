package com.Assignment_on_array;

import java.util.Arrays;
import java.util.Scanner;

public class Unique_Elements 
{
			public void unique_Elements(int a[])
			{
				System.out.println(Arrays.toString(a));
				for(int i=0;i<a.length;i++)
				{
					int count=1;
					boolean isvisited = false;
					for(int k=i-1; k>=0;k--)
					{
						if(a[i]==a[k])
						{
							isvisited=true;
							break;
						}
					}
					if(isvisited==false)
					{
					for(int j=i+1; j<a.length;j++)
					{
						if(a[i]==a[j])
						{
							count++;
						}
					}
					if(count==1)
					{
						System.out.println("Unique Elements= "+a[i]+" "+count);
					}
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
				
				Unique_Elements u=new Unique_Elements();
				u.unique_Elements(a);
			}
			
}
