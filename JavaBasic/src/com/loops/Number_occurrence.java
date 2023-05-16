package com.loops;

import java.util.Scanner;

public class Number_occurrence {

	public static void main(String[] args) 
	{
		// find out the occurrence of ech digit from number 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt(); //1221
		int   digit0=0, digit1=0 , digit2=0, digit3=0, digit4=0, digit5=0, digit6=0 , digit7=0, digit8=0, digit9=0;
		while(num>0)
		{
			int digit = num%10;
			
			if(digit==0)
			{
				digit0++;
			}
			else if(digit==1)
			{
				digit1++;
			}
			else if(digit==2)
			{
				digit2++;
			}
			else if(digit==3)
			{
				digit3++;
			}
			else if(digit==4)
			{
				digit4++;
			}
			else if(digit==5)
			{
				digit5++;
			}
			else if(digit==6)
			{
				digit6++;
			}
			else if(digit==7)
			{
				digit7++;
			}
			else if(digit==8)
			{
				digit8++;
			}
			else if(digit==9)
			{
				digit9++;
			}
			
			num=num/10;
			
		}
		System.out.println("Digits in number as follows: \n 0= "+digit0+" \n 1= "+digit1+" \n 2= "+digit2+" \n 3= "+digit3+" \n 4= "+digit4+" \n 5= "+digit5+" \n 6= "+digit6+" \n 7= "+digit7+" \n 8= "+digit8+" \n 9= "+digit9);

	}

}
