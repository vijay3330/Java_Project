package com.switchcase;

import java.util.Scanner;

public class Even_odd_number 
{
	// Write a Java program to check whether a number is even or odd using switchcase 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		switch (num % 2) {
		case 0:
			System.out.println("Number is even number");
			break;

		case 1:
			System.out.println("Number is odd number");
			break;
		}

	}

}
