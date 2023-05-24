package com.arraydemo;

import java.util.Arrays;

public class Reverse_Array 
{
		
		public static void reverseArray(int a[])
		{
				int j=a.length-1;
				System.out.println(a.length-1);
				for(int i=0; i<=a.length/2; i++)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					j--;
				}
		}
	
	
		public static void main(String[] args) 
		{
			int a[]= {1,2,3,4,5};
			
		//	System.out.println(a.length);
			
			System.out.println(Arrays.toString(a));
			Reverse_Array.reverseArray(a);
			System.out.println(Arrays.toString(a));
			
		}
	
}
