package com.Test_1;

public class Factorial_sum {

	public static void main(String[] args) 
	{
		int fact=1;
		int sum=0;
		for(int i=1;i<=20;i++)
		{
			fact=fact*i;
			sum=sum+fact;
		}
		System.out.println(sum);
	}

}
