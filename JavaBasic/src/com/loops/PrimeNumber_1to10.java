package com.loops;

public class PrimeNumber_1to10 {

	public static void main(String[] args) 
	{
		//display prime between 1 to 10;
		
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
			{
				System.out.println(num);
			}
		}

	}

}
