package com.algo;

import java.util.Arrays;
import java.util.Scanner;

public class a {

	public static void main(String[] args) 
	{
		
			String s= "india is my country india is best country";
			
			String a[]=s.split(" ");
			System.out.println(Arrays.toString(a));
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						System.out.println(a[j]);
					}
				}
			}
		
		
	

	}

}
