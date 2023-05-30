package com.stringDemo;

import java.util.Scanner;

public class Reverse_Word_Except_First_Last 
{
		
		public void reverseWord(String str)
		{
			String st[] =str.split(" ");
			String reversevalue="";
			for(int i=1;i<st.length-1;i++)
			{
				String word = st[i];
				String reversword="";
				for(int j=word.length()-1;j>=0;j--)
				{
					reversword=reversword+word.charAt(j);
				}
				reversevalue = reversevalue+" "+ reversword;
				
			}
			System.out.println(reversevalue);
		}
	
	
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String");
			String str= sc.nextLine();
			
			Reverse_Word_Except_First_Last r=new Reverse_Word_Except_First_Last();
			
			r.reverseWord(str);
			
			
			
		}
		
}
