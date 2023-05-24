package com.arraydemo;

import java.util.Arrays;

public class Print_Array_Reverse
{
	public static void printReverse(int a[])
	{
		for(int i=a.length -1 ; i >=0; i--)
		{
			System.out.print(a[i]+" ");
		}
	}
		
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(a));
		
		Print_Array_Reverse.printReverse(a);
	}
	
	
}
