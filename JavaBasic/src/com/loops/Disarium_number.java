package com.loops;

import java.util.Scanner;

public class Disarium_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int copy = num;
		int count = 0;
		int sum = 0;

		while (num > 0) {
			count++;
			num = num / 10;
		}
		System.out.println(count);
		num = copy;

		while (num > 0) {
			int digit = num % 10;
			int power = 1;

			for (int i = 1; i <= count; i++) {
				power = power * digit;
			}
			sum = sum + power;
			count--;
			num=num/10;
			
		}
		System.out.println(sum);
		if(sum==copy)
		{
			System.out.println(sum+ "Number is disarium number");
		}
	}
}
