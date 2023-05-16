package com.lab;

import java.util.Scanner;

public class Find_Factor 
{
	/*6)Betsy  teaches her daughter  to find the factors of a given number. 
 When she provides a number to her daughter, she should tell the factors of that number.  Help her to do this, by writing a program.
Write a class FindFactor.java and write the main method in it.
Note : 
    If the input provided is negative, ignore the sign and provide the output. If the input is zero
    If the input is zero the output should be “No Factors”. */
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if(num>0)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					System.out.println(i);
				}
			}
		}
		else
		{
			if(num<0)
			{
				num=num*-1;
				
				for(int i=1;i<=num;i++)
				{
					if(num%i==0)
					{
						System.out.println(i);
					}
				}
			}
			
		}
		
	}
	
}
