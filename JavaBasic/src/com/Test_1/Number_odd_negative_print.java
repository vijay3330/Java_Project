package com.Test_1;

public class Number_odd_negative_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			else
			{
				System.out.println(-i*i);
			}
		}

	}

}
