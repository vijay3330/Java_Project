package com.arraydemo;

import java.util.Arrays;

public class Avg_Prime_Number {
	public static void findAvg(int a[]) {

		int sum = 0;
		int avg = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			boolean isprime = true;
			int n = a[i];
			for (int j = 2; j < n; j++) {
				if (n % j == 0) {
					isprime = false;
					break;

				}
			}
			if (isprime) {
				sum = sum + n;
				count++;

			}

		}
		System.out.println("sum= " + sum);
		avg = sum / count;
		System.out.println("Avg= " + avg);
	}

	public static void main(String[] args) {
		int a[] = { 2, 22, 27, 4, 17 };

		System.out.println(Arrays.toString(a));

		Avg_Prime_Number.findAvg(a);

	}

}
