package com.lab;

import java.util.Scanner;

public class car_lucky_number {

	/*
	 * 1) William planned to choose a four digit lucky number for his car. His lucky
	 * numbers are 3,5 and 7. Help him find the number, whose sum is divisible by 3
	 * or 5 or 7. Provide a valid car number, Fails to provide a valid input then
	 * display that number is not a valid car number.
	 * 
	 * Note : The input other than 4 digit positive number[includes negative and 0]
	 * is considered as invalid.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car number to check lucky number or not..");
		int num = sc.nextInt();
		int carnum = num;
		int sum = 0;
		int count = 0;

		while (num > 0) {
			count++;
			num = num / 10;
		}
		if (count < 4) {
			System.out.println(carnum + " is not a valid car number");
		} else {
			while (carnum > 0 && carnum != 0 && count == 4) {
				int digit = carnum % 10;
				sum = sum + digit;
				carnum = carnum / 10;

			}
			if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
				System.out.println("Lucky Number");
			} else {
				System.out.println("Sorry its not my lucky number");
			}

		}

	}

}
