package com.arraydemo;
public class Find_prime_num 
{
	public static boolean isPrime(int n)
	{		
			boolean Checkprime=true;
			for(int i=0;i<n;i++)
			{
				if(n%2==0)
				{
					Checkprime=false;
					break;
				}
			}
			
			return Checkprime;
		
	}
	
	
	public static void main(String[] args)
	{
		
		int a[] = {7,5,3,4,8};
		
		for(int i=0; i<a.length;i++)
		{
			if(isPrime (a[i]))
			{
				System.out.println(a[i]);
			}
		}
		
		
	}
	
	
}
