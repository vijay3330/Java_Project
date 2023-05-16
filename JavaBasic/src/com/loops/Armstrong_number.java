package com.loops;
import java.util.Scanner;
public class Armstrong_number {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number is to be check for amrstrong number");
		int num = sc.nextInt();
		int sum=0;
		int temp= num;
		
		while(num>0)  //153 = 1*1*1 + 5*5*5 + 3*3*3* =27+125+1= 153
		{
			int digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
			
		}
		if(sum==temp)
		{
			System.out.println("Number is Armstrong number");
		}
		else
		{
			System.out.println("Number is Not Armstrong number");
		}
	}

}
