package com.stringDemo;

import java.util.Scanner;

public class Find_Sum_From_String 
{
			public void findSum(String s)
			{
				int sum=0;
				for(int i=0;i<s.length();i++)
				{
				//	if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
					if(Character.isDigit(s.charAt(i)))
					{
						System.out.println(s.charAt(i));
						
						sum = sum + Character.getNumericValue(s.charAt(i));
					}
				}
				System.out.println("Sum= "+sum);
			}
	
	
			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter The String");
				String s= sc.nextLine();
				
				Find_Sum_From_String f=new Find_Sum_From_String();
				f.findSum(s);
				
			}
	
}
