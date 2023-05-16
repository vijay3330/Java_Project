package com.switchcase;

import java.util.Scanner;

public class Simple_Calculator 
{
	// take two numbers from user and one operator and as per the operator perform the opetion on number using operator
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num 1");
		int num1 = sc.nextInt();
		System.out.println("Enter Num 2");
		int num2 = sc.nextInt();
		System.out.println("Select Opretor");
		char ch = sc.next().charAt(0);

		switch (ch) {
		case '+':
			System.out.println("Addition of two numbers: " + (num1 + num2));
			break;

		case '-':
			System.out.println("substraction of two numbers: " + (num1 - num2));
			break;

		case '*':
			System.out.println("Multiplication of two numbers: " + (num1 * num2));
			break;

		case '/':
			System.out.println("devision of two numbers: " + (num1 / num2));
			break;

		default:
			System.out.println("invalid oprator");
		}

	}

}
