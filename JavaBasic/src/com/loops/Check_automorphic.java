package com.loops;
import java.util.Scanner;
public class Check_automorphic {

	public static void main(String[] args) 
	{
		
			Scanner sc=new Scanner(System.in); 
			System.out.println("Enter the number");
			int num=sc.nextInt();
			int copy=num;
			int sqr=num*num;
			System.out.println("Number Sqr: "+ sqr);
			int count=0, power=1;
			
			while(num>0)
			{
				count++;
				num=num/10;
				
			}
			for(int i=1;i<=count;i++)
			{
				power=power*10;
			}
			int digit = sqr%power;
			
			if(digit==copy)
			{
				System.out.println("Automorphic");
			}
			else
			{
				System.out.println("Not automorphic");
			}
				
				
		}
		
		

	}


