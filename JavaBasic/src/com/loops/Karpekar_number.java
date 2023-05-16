package com.loops;
import java.util.Scanner;
public class Karpekar_number {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int copy=num;
		int sqr=num*num;
		int coysqr=sqr;
		int count=0, sum=0;
		
		while(sqr>0)
		{
			count++;
			sqr=sqr/10;
		}
		System.out.println(count);
		for(int i=1;i<=count;i++)
		{
			if(count>2)
			{						
				for(int j=1;j<=count;j++)
				{
					int digit=coysqr%100;
					sum=sum+digit;
					coysqr=coysqr/100;
				}
			}
			int digit=coysqr%10;
			sum=sum+digit;
			coysqr=coysqr/10;
		}
		if(sum==copy)
		{
			System.out.println(sum+" "+" number is karpekar number");
		}
		else
		{
			System.out.println(sum+" "+" number is not karpekar number");

		}
		
		
		
		

	}

}
