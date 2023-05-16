package com.switchcase;

import java.util.Scanner;

public class Vowel_consonant
{
	//Write a Java program to input any alphabet and check whether it is vowel or consonant 

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
			case 'A' : System.out.println("Vowel");
			 			break;
			 
			case 'E' : System.out.println("Vowel");
 						break;
 						
			case 'I' : System.out.println("Vowel");
 						break;
 			
			case 'O' : System.out.println("Vowel");
 						break;
 			
			case 'U' : System.out.println("Vowel");
 						break;
 			
			case 'a' : System.out.println("Vowel");
 						break;
 			
			case 'e' : System.out.println("Vowel");
						break;
 			
			case 'i' : System.out.println("Vowel");
 						break;
 			
			case 'o' : System.out.println("Vowel");
 						break;
 						
			case 'u' : System.out.println("Vowel");
 						break;
 						
 			default  : System.out.println("Consonant");
 			
		}
		
		
		
		
		
		
		
		
		

	}

}
