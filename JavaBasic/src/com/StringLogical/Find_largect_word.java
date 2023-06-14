package com.StringLogical;

import java.util.Arrays;

public class Find_largect_word
{
		public static void main(String[] args) 
		{
			String s="I like programming";
			
			String[] a = s.split(" ");
			int i;
			for( i=0; i<a.length-1; i++)
			{
				for(int j=i+1; j<a.length; j++)
				{
					if(a[i].length() > a[j].length())
					{
						String temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
				
			
			System.out.println(a[i]);
		}
}
