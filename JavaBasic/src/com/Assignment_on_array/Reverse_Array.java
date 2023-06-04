package com.Assignment_on_array;

import java.util.Arrays;

public class Reverse_Array 
{
		
			public void revArray(int a[])
			{	
				int b[]=new int[a.length];
				int count=a.length-1;
				for(int i=0 ; i<a.length ; i++)
				{
						b[i]=a[count]-2;
						count--;
					
				}
				
				System.out.println(Arrays.toString(b));
				
			}
	
			public static void main(String[] args) 
			{
				int a[]= {4,5,6,7,8};
				Reverse_Array r=new Reverse_Array();
				r.revArray(a);
			}
	
	
}
