package com.Test_1;

public class Pattern_1 {
	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				for (int l = k; l <= i; l++) {
					if (i == 3 && k == 3 && l == 3 || (i == 4 && k == 3 && l == 3) || (i == 4 && k == 3 && l == 4)
							|| (i == 4 && k == 4 && l == 4)) {
						continue;
					}
					System.out.print(i);

				}

			}

			System.out.println();

		}
	}
}
