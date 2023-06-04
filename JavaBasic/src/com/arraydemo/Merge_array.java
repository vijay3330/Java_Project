package com.arraydemo;

import java.util.Arrays;

public class Merge_array
{
		
			
	
			public static void main(String[] args) 
			{
				int a[]= {1,2,3};
				System.out.println("Array 1= "+Arrays.toString(a));
				int b[]= {4,5,6};
				System.out.println("Arrays 2= "+Arrays.toString(b));
				int c[]= new int[a.length + b.length];
				
				for(int i=0; i<a.length;i++)
				{	
					
					c[i]=a[i];
				}
				for(int i=0;i<b.length;i++)
				{	
					
					c[i + a.length]=b[i];
				}
				
				System.out.println("Merge Array = "+Arrays.toString(c));
				
				
			}
			
		
	
	
}
