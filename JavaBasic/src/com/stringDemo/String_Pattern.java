package com.stringDemo;

import java.util.Scanner;

public class String_Pattern 
{		
		public void stringPattern(String str )
		{
			String st[] =str.split(" ");
			for(int i=0;i<st.length;i++)
			{
				for(int j=0;j<= i;j++)
				{
					System.out.print(st[j]+" ");
					
				}
				System.out.println();
			}
		}

		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string");	
			String str=sc.nextLine();
			
			String_Pattern p=new String_Pattern();
			p.stringPattern(str);
	
		}
	
}
