package com.stringDemo;

import java.util.Arrays;
import java.util.Scanner;

public class String_Anagram 
{
			
		public boolean checkAnagaram(String str1, String str2)
		{
			boolean isanagram=false;
			
			if(str1.length()==str2.length()) // first check length of both string
			{
				String st1= str1.toLowerCase();
				String st2= str2.toLowerCase();
				
				char ch1[]= st1.toCharArray();	//convert string into char array
				char ch2[]= st2.toCharArray();
				
				Arrays.sort(ch1);		//sort array by default in accending order
				Arrays.sort(ch2);
				
				String s1=new String(ch1);
				String s2=new String(ch2);
				
				if(s1.equals(s2))
				{
					isanagram=true;
				}
				else
				{
					isanagram=false;
				}
				
			}
			else
			{
				isanagram=false;
			}
			
			return isanagram;
		}
	
	
	
			
		public static void main(String[] args) 
		{
			// anagram string peek==keep race==care
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the 1st String");
			String str1=sc.next();
			System.out.println("Enter the 2nd String");
			String str2=sc.next();
			
			String_Anagram s=new String_Anagram();
			s.checkAnagaram(str1, str2);
			
			if(s.checkAnagaram(str1, str2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not");
			}
			
		}
		
}
