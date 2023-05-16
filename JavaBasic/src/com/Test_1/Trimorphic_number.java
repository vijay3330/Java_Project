package com.Test_1;

import java.util.Scanner;

public class Trimorphic_number {
	
	/*
	 * write a java program to check given number is trimorphic  number or not
4 is trimorphic number as its cube (64) contains 4  at the end .
5 is trimorphic number as its cube (625)contains 5 at the end

	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int cube = 0;

		cube = num * num * num;

		int digit = 0;

		while (cube > 0) {
			digit = cube % 10;
			break;
		}
		if (num == digit) {
			System.out.println("Number is Trimorphic");
		} else {
			System.out.println("Number is not Trimorphic");
		}

	}

}
