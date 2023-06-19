package com.StringLogical;

public class Check_sum
{
			public static void checkReverseSum(int num)
			{
				int sum=0;
				int count=0;
				int digit=0;
				while(num!=0)
				{
					 digit = num%1000;
					 
					num=num/1000;
					
					
				}
				
			
				
				
			}
				
			public static void main(String[] args)
			{
				String s="678597";
				
				int num = Integer.parseInt(s);
				
				checkReverseSum(num); 
				
			}
	
}
