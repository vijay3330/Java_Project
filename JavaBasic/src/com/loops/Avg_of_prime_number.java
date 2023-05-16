package com.loops;

public class Avg_of_prime_number
{

	public static void main(String[] args)
	{
		int count=0;
		int sum=0;
		double avg;
	
		for(int num=1;num<=10;num++)
		{
			boolean isprime=true;
			
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					isprime=false;
					break;
				}
			}
			
			if(isprime==true)
			{	count++;
				sum=sum+num;
			}
		}
			System.out.println("Sum:" +" "+sum);
			System.out.println("count:"+" "+count);
			avg=(sum/count);
			
			System.out.println("avg"+" "+avg);
		
	}
	
	
	
}
