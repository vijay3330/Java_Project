package com.arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class Alternate_char 
{
		public static void  alternateChar(char ch[])
		{
			for(int i=0; i<ch.length; i++)
			{
				if(ch[i] > 'A' && ch[i] < 'Z')
				{
					ch[i]=(char) (ch[i]+2);
				}
				if(ch[i] > 'a' && ch[i] < 'z')
				{
					ch[i]=(char) (ch[i]+2);
				}
			}
			System.out.println(Arrays.toString(ch));
		}
	
		public static void main(String[] args) 
		{
		//	char ch[] = {'S','a','K','g'};
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Elements");
			char ch[] = new char[4];
			for(int i=0; i<ch.length;i++)
			{
				ch[i]=sc.next().charAt(0);
			}
			
			System.out.println(Arrays.toString(ch));
			
			Alternate_char.alternateChar(ch);
			
		}
}
