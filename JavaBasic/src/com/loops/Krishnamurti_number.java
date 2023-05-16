package com.loops;
import java.util.Scanner;
public class Krishnamurti_number {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int copy=num;
		
		int sum=0;
		
		while(num>0)
		{
			int digit = num%10;
			int fact=1;
			for(int i=1; i<=digit; i++)
			{
				fact=fact*i;
			}
			System.out.println(fact);
			sum=sum+fact;
			num=num/10;
			
		}
		System.out.println(sum);
		if(sum==copy)
		{
			System.out.println(copy+" "+ "num is krishnamurti");
		}
		
	}

}
