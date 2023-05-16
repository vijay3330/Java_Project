package com.basicprog;

import java.util.Scanner;

public class Compound_intrest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the principle amount");
		double principle = sc.nextInt();
		System.out.println("Enter the interest rate");
		double intrest = sc.nextDouble();
		System.out.println("Enter the time in year");
		double time = sc.nextInt();
		System.out.println("Enter number of times Compound interst year");
		double nt = sc.nextInt();

		double amount = principle * (1 + (intrest / nt)) * (time * nt);

		System.out.println(amount);

	}

}
