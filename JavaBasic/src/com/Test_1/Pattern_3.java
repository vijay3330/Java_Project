package com.Test_1;

public class Pattern_3 {
	public static void main(String[] args) {
		int count = 0;

		for (int i = 5; i >= 1; i--) {
			for (int k = 1; k <= count; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}

			count++;
			System.out.println();
		}

	}
}
