package com.Test_1;

import java.util.Scanner;

public class Twin_prime_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 2;
		boolean isprime = true;
		int sum = 0;
		char ch;

		do {
			System.out.println("Enter the first number");
			int num1 = sc.nextInt();
			while (i < num1) {
				if (num1 % i == 0) {
					isprime = false;
					break;
				}
				i++;

			}
			if (isprime) {
				System.out.println("Number is prime number");
			} else {
				System.out.println("Number is not prime number");
				break;
			}

			System.out.println("Enter the second number");
			int num2 = sc.nextInt();

			while (i < num2) {
				if (num2 % i == 0) {
					isprime = false;
					break;
				}

				i++;

			}
			if (isprime) {
				System.out.println("Number is prime number");
			} else {
				System.out.println("Number is not prime number");
			}
			sum = sum + (num1 - num2);
		//	System.out.println("Difference of two number is: " + sum);
			if (sum == 2 || sum==(-2)) {
				System.out.println("Both number are prime number and twin number");
			} else {
				System.out.println("Both number are prime number but not twin number");
			}
			System.out.println("Do you want to continue ");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}
