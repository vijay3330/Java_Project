package com.loops;
import java.util.Scanner;

public class PrimeNumber_Counter {

	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int num=sc.nextInt();
			int i=2;
			int count=0;
			
			while(num>i)
			{
				if(num%i==0)
				{
					count++;
					break;
				}
				i++;
			}
			if(count==0)
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("Not prime");
			}
	}

}
