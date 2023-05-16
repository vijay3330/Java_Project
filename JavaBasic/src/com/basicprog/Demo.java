package com.basicprog;

public class Demo 
{

	public static void main(String[] args)
	{
		int X=10;
		
		System.out.println(X++); //10 
		System.out.println(++X); //12
		System.out.println(X--); //11
		System.out.println(--X); //11
		
		System.out.println("---------------");
		
		int a=10 , b=10;
		System.out.println(a++ + ++a);
		System.out.println(b++ + b++);
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("--------------");
		
		int M=4, N=3;
		System.out.println(M+N);
		System.out.println(M-N);
		System.out.println(M/N);
		System.out.println(M%N);
		
		System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2); //21 
		System.out.println(-5 + 8*6); //43
		System.out.println((55+9) % 9); //1
		System.out.println(20 + -3*5 / 8); //19
		System.out.println(5 + 15 / 3 * 2 - 8 % 3); //13
		
		
		
	}
	
	
}
