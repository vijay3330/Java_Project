package com.arraydemo;

import java.util.Scanner;



public class Find_Max_Element 
{

	public static void findMax(char ch[])
	{
		for(char c : ch)
		{
			System.out.println(c+" "+(int)(c));
		}
		char maxchar=ch[0];
		for(int i=0;i<ch.length;i++)
		{
			
			if(maxchar < ch[i])
			{
				maxchar=ch[i];
			}
		}
		
		System.out.println(maxchar);
	}
	
	
	public static void main(String[] args) 
	{
		char ch[] = new char[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elemnets");
		
		for(int i=0; i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		
		Find_Max_Element.findMax(ch);
		
		
		
	}
	
	
}
