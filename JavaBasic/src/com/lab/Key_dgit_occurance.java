package com.lab;

import java.util.Scanner;

public class Key_dgit_occurance 
{
	/*
	 * 5)Pinky’s mom provides Pinky  with a number  and a key digit. She wants Pinky to find out how many times that key digit appears in that number.  
Help Pinky to do that by writing a program.
	 */
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int cnum=num;
		System.out.println("Enter the key digit");
		int key=sc.nextInt();
		int count=0;
		while(num>0)
		{
			int digit = num%10;
			if(digit==key)
			{
				count++;
			}
			num=num/10;
		}
		System.out.println(key+" appears "+ count +" times in "+cnum);
	}
	
	
}
