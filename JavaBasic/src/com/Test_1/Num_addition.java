package com.Test_1;

import java.util.Scanner;

public class Num_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you want addition upto that number");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
