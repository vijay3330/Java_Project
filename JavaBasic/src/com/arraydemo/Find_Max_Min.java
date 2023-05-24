package com.arraydemo;

import java.util.Arrays;

public class Find_Max_Min 
{
		
	
	
		public static void findMax_Min(int a[])
		{	
			int max=a[0];
			for(int i=0; i<a.length; i++)
			{	
				
				if(max < a[i])
				{
					max=a[i];
				}
			}
			System.out.println("Max Element = "+max);
			
			int min=a[0];
			for(int i=0; i<a.length;i++)
			{
				if(min > a[i])
				{
					min=a[i];
				}
			}
			System.out.println("Min Element = "+min);
		}
	
		public static void main(String[] args)
		{
			int a[]= {1,2,3,4,5};
			
			System.out.println(Arrays.toString(a));
			
			Find_Max_Min.findMax_Min(a);
		}
	
}
