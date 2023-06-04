package com.stringDemo;

import java.util.Scanner;

public class Convert_Togglecase 
{
		public void convertTo(String s)
		{
			for(int i=0; i<s.length();i++)
			{	
				char ch;
				if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				{
					ch= (char) (s.charAt(i)+32);
					
					 System.out.print(ch);
					
				}
				else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				{
					
					ch= (char) (s.charAt(i)-32);
					
					 System.out.print(ch);
				}
				
				
				
			}
		}
		
		
	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String");
			String s=sc.nextLine();
		
			//System.out.println(s.toUpperCase());
			Convert_Togglecase c=new Convert_Togglecase();
			c.convertTo(s);
		}
}
