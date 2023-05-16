package com.basicprog;

public class Operator {

	public static void main(String[] args) {
		
		
		int a= 2;
		int b= 2;
		
		int x=++a + ++b;
		System.out.println(x+" "+a+" "+b);	//  6 = 3 + 3					a=2 b=6
		
		x=a++ + b++;
		System.out.println(x+" "+a+" "+b); 	//  6 = 4 + 4
		
		x=a-- -b-- -a;
		System.out.println(x+" "+a+" "+b);	//  -3= 3 + 3
		
		x=--a + ++b;
		System.out.println(x+" "+a+" "+b);	// 6 = 2 + 4
		
		x=a++ - ++b + --a;
		System.out.println(x+" "+a+" "+b);	//  2 - 5 + 2 = -1 2 5
		
		x=b++ - a++ + --a;
		System.out.println(x+" "+a+" "+b);	// 5 - 2 + 2 = 5 2 6

	}

}
