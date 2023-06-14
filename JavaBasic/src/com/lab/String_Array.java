package com.lab;

public class String_Array 
{
	public static void main(String[] args) 
	{
		String a[] = {"red", "yellow", "green", "blue"};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					String temp = a[i];  
					a[i] = a[j];  
					a[j] = temp;  
				}
			}
//			System.out.println(a[i]);
		}
		
		  for (int i = a.length-1; i >= 0; i--)
		  {  
	            System.out.print(a[i] + " ");  
	      }  
	}	
	
	
}
