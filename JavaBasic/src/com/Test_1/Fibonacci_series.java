
package com.Test_1;

public class Fibonacci_series {

	public static void main(String[] args) 
	{
		int num1=0;
		System.out.println(num1);
		int num2=1;
		System.out.println(num2);
		int num3;
		
		for(int i=0;i<=17;i++)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
			
			System.out.println(num3);
		}

	}

}
