package com.arraydemo;

import java.util.Arrays;

public class Even_Position_Display 
{
	
		public static void evenPosition(int a[])
		{
			for(int i=0;i<a.length;i=i+2)
			{
				System.out.println(i+" "+a[i]);
			}
		}
			
		public static void main(String[] args) 
		{
			
			int a[]= {1,2,3,4,5};
			System.out.println(Arrays.toString(a));
			System.out.println(" Elements of given array present on even position:");
			Even_Position_Display.evenPosition(a);
			
			
			
			
		}
}	
