package com.stringDemo;

import java.util.Scanner;

public class Find_NumofVowels 
{
		public void findnumVowel(String str)
		{	
				int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' )
				{
					count++;
				}
				
			}
			System.out.println("Vowels in String= "+count);
		}
	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String");
			String str= sc.nextLine();
			
			Find_NumofVowels f=new Find_NumofVowels();
			f.findnumVowel(str);
			
		}
}
