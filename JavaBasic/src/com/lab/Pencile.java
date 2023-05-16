package com.lab;

import java.util.Scanner;

public class Pencile
{
	/*
	 * 3)Nila uses pencils to write at school and at home. When she was in her 1st standard, her parents bought her one pencil. 
In her 2nd standard, she needed 5 pencils, and in 3rd standard, she needed 14 pencils and so on. 
How many pencils does she get from the provided standard?

Note : If the input given is not between 1 to 12  then the output should be "Invalid Standard"
	 */
	
		public static void main(String [] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Standard");
			int std=sc.nextInt();
			int pencils=0;
			if(std>0 && std<=12)
			{
				for(int i=1; i<=std;i++)
				{
					pencils=pencils+(i*i);
				}
				System.out.println("Nilla gets "+pencils+" pencils");
			   
			}
			else
			{
				System.out.println("Invalid Standard");
			}
			
			
		}
		
	
	
	
	
}
