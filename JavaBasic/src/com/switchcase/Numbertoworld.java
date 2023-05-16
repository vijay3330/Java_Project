package com.switchcase;

import java.util.Scanner;

public class Numbertoworld {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a number");
		int num=sc.nextInt();
		
		switch(num)
		{
			case 1: 
						System.out.println("one");
						break;
			
			case 2: 
				System.out.println("two");
						break;
			
			case 3: 
				System.out.println("three");
						break;
			
			default :
				System.out.println("Wrong Input");
		}
		
		
	}

}
