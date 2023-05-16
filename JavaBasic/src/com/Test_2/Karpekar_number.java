package com.Test_2;

import java.util.Scanner;

public class Karpekar_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sqr = num * num;
		int copysqr=sqr;
		int sum = 0;
		int count=0;
		while (sqr > 0) 
		{
			count++;
			sqr=sqr/10;
		}
		System.out.println("digit count: "+count);
		
		while(copysqr>0)
		{
		for(int i=1;i<=count;i++)
		{
			if( count==1 || count==2 || count==3 || count==4)
			{
				int digit=copysqr%100;
				sum=sum+digit;
				copysqr=copysqr/100;
			}
			else
			{
				int digit=copysqr%1000;
				sum=sum+digit;
				copysqr=copysqr/1000;
			}

		}
		}
		System.out.println(sum);
		System.out.println(num);
		if (sum == num) {
			System.out.println("karpekar number");
		} else {
			System.out.println("not karpekar");
		}

	}

}
