package com.Test_1;
import java.util.*;
public class Spy_Number 
{
		public static void main(String [] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number to check spy or not");
			int num=sc.nextInt();
			int copy=num;
			int sum=0;
			int product=1;
			int count=0;
			
			while(num>0)
			{
				count++;
				num=num/10;
			}
			
			for(int i=1;i<=count;i++)
			{	
				int digit=copy%10;
				sum=sum+digit;
				product=product*digit;
				copy=copy/10;
			}
			System.out.println(sum);
			System.out.println(product);
			if(sum==product)
			{
				System.out.println("Number is Spy Num");
			}
			else
			{
				System.out.println("Number is not spy num");
			}
			
		}
		
}
