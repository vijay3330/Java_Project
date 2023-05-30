package com.stringDemo;

import java.util.Scanner;

public class Find_NumofWords
{
		public void findnumwords(String str)
		{	
			 int count=0;
			 String st[] = str.split(" ");
			 
			 for(int i=0;i<st.length;i++)
			 {
				 String word=st[i];
				 count++;
			 }
			System.out.println("Count of words in String= "+count);
		}
		
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String");
			String str=sc.nextLine();
			
			Find_NumofWords f=new Find_NumofWords();
			f.findnumwords(str);
			
		}
}
