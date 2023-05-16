package com.loops;

public class Check_primenum {

	public static void main(String[] args) {
		int num = 89734;
		int count=0;
		
		while (num > 0) {

			int digit = num % 10;
			count=0;
			
			for (int i = 2; i < digit; i++) 
			{
				if (digit % i == 0) {
					count++;
				}
				
				
				
			}
			num = num / 10;
			if(count==0)
			{
				System.out.println(digit);
			}
		}

	}

}
