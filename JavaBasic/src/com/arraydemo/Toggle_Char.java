package com.arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class Toggle_Char
{
	public static void toggleChar(char ch[])
	{
		System.out.println(Arrays.toString(ch));
		
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i] >='A' && ch[i] <= 'Z')
			{
				ch[i]=(char) (ch[i]+32);
			}
			else if (ch[i] >= 'a' && ch[i] <= 'z')
			{
				ch[i]=(char) (ch[i]-32);
			}
			else
			{
				ch[i]=ch[i];
			}
		}
		System.out.println(Arrays.toString(ch));
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		
		char ch[] = new char[5];
		
		for(int i=0; i<ch.length; i++)
		{
			ch[i] = sc.next().charAt(0);
		}
		
		Toggle_Char.toggleChar(ch);
	}
	
}
