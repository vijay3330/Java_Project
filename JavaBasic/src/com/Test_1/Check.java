package com.Test_1;

import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		while (num > 0) {
			int digit = num % 10;
			// System.out.println(digit);
			if (digit == 3) {
				System.out.println(true);
				break;
			}

			num = num / 10;

		}
		int digit = num % 10;
		if (digit != 3 || digit < 0) {
			System.out.println(false);
		}

	}
}
