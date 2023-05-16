package com.lab;

import java.util.Scanner;

public class Trnsaction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin = 1234;
		char ch;
		int balance = 1000;
		int num = 3;

		do {
			while (num > 0) {
				System.out.println("Plese Enter Your Secret Number");
				int epin = sc.nextInt();
				if (epin == pin) {
					System.out.println("Your Pin is correct please continue..");
					System.out.println("Enter your choce \n1.Deposite 2.Withdraw 3.Check balance 4.Exit");
					int choice = sc.nextInt();

					switch (choice) {
					case 1:
						System.out.println("Please enter the amount");
						int amount = sc.nextInt();
						balance = amount + balance;
						System.out.println(
								"You have diposited " + amount + " Rs " + " succesfully your balance is: " + balance);
						break;

					case 2:
						System.out.println("Please enter the amount");
						int wd = sc.nextInt();
						if (wd <= balance) {
							balance = balance - wd;
							System.out.println("You have succsesfully withdraw " + wd
									+ " Rs amount now your balance is: " + balance);
						} else {
							System.out.println(
									"You have not sufficient balance for withdraw your balance is: " + balance);
						}
						break;

					case 3:
						System.out.println("Your balance is " + balance + " Rs");
						break;

					default:

					}
				} else {
					System.out.println("Your Pin is incorrect correct please enter correct pin..");
					num = num / 10;
				}
			}
			System.out.println("Doy want continue banking... \nPress y or Y \nfor exit press n or N");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

	}

}
