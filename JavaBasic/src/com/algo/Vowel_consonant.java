package com.algo;

import java.util.Scanner;

public class Vowel_consonant {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A Character:");
		
		char ch= sc.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o')
		{
			System.out.println(ch+ " is vowel");
		}
		else
		{
			System.out.println(ch+ " is consonant");
		}
	
		
		
	}

}
