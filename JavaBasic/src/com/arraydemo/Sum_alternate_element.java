package com.arraydemo;

import java.util.Arrays;

public class Sum_alternate_element 
{
		public static void findSum(int a[])
		{
			int sum=0;
			for(int i=0; i<a.length; i=i+2)
			{
				sum=sum+a[i];
			}
			System.out.println("sum= "+sum);
		}
			
		public static void main(String[] args) 
		{
			int a[] = {1,2,3,4,5};
			
			System.out.println(Arrays.toString(a));
			
			Sum_alternate_element.findSum(a);
		}
	
}
