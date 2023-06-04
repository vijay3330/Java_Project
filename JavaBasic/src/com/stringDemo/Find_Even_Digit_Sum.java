package com.stringDemo;

import java.util.Scanner;

public class Find_Even_Digit_Sum 
{
		public void findEven(String s)
		{
			int sum=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
				{
					int num = Character.getNumericValue(s.charAt(i));
					
					if(num%2==0)
					{
						System.out.println(num);
						sum=sum+num;
					}
				}
			}
			System.out.println("Sum Of All even Numbers from String = "+ sum);
		}
		
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String");
			String s= sc.nextLine();
			
			Find_Even_Digit_Sum f=new Find_Even_Digit_Sum();
			f.findEven(s);
		}
		
}
