package com.loops;

public class HarshadNumber {

	public static void main(String[] args) 
	{
		
		int num=158;
		int copy=num;
		int sum=0;
		
		while(num>0)
		{
			int digit = num%10;
			
			sum=sum+digit;
			
			num=num/10;
		}
		if(copy%sum==0)
		{
			System.out.println("harshad number");
		}
		else
		{
			System.out.println("not harshad number");
		}
		

	}

}
