package com.stringDemo;

import java.util.Scanner;

public class Reverse_String 
{
		
//			public void reversString(String str)
//			{	
//				System.out.println(str);
//				
//				String reverse="";
//				
//				for(int i=str.length()-1;i>=0;i--)
//				{
//					reverse=reverse+str.charAt(i);
//				}
//				
//				System.out.println(reverse);
//			}
			
			// reverse word
			
			public void reverseWord(String str)
			{
				System.out.println(str);
				
				String st1[] = str.split(" ");
				String reversvalue="";
				for(int i=0;i<st1.length;i++)
				{
					String word=st1[i];
					String revword="";
					for(int j=word.length()-1;j>=0;j--)
					{
						revword = revword + word.charAt(j);
					}
					
					reversvalue =reversvalue +" "+ revword;
					
				}
				
				System.out.println(reversvalue);
			}
			
			
			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the string");
				String s=sc.nextLine();
				Reverse_String r=new Reverse_String();	
//				r.reversString(s);
				
				System.out.println("...................");
				
				r.reverseWord(s);
				
			}
			
			
			
			
}
