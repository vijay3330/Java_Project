package com.stringDemo;

import java.util.Scanner;

public class Find_NumofChar_ 
{
		public void findnumChar(String str)
		{	int count=0;
			for(int i=0; i<str.length(); i++)
			{
				 str.charAt(i);
				 count++;
			}
			
			System.out.println("Character Count in String= "+count);
		}
		
		
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String");
			String s=sc.nextLine();
			
			Find_NumofChar_ f= new Find_NumofChar_();
			f.findnumChar(s);
			
		}
	
	
}
