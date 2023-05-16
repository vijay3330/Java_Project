package com.lab;
import java.util.Scanner;
public class Person 
{
		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int num=sc.nextInt();
			int count=0;
			//01203
			while(num>=1)
			{
				int digit=num%10;
				
//				if(digit==0 && num>0)
//				{
//					num=num/10;
//					continue;
//				}
				 if(digit==0)
				{
					 count++;
					 num=num/10;
//					 if(num==0)
//					 {
//						 System.out.println("Number is not duck Number");
//							break;
//					 }
//					 else {
//					System.out.println("Number is duck Number");
//					break;
//					 }
				}
				else 
				{
					num=num/10;
				}
				
				
			}

			if(count ==0 && num==0)
			 {
				 System.out.println("Number is not duck Number");

			 }
			
			 else if(count >=1 && num==0)
			 {
					
					System.out.println("Number is not duck Number");				
					
			 } 
			else
			{
				System.out.println("Number is duck Number");
			}
			 
			
			
			
			
		}
}
