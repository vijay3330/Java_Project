package com.arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class Element_present 
{
		public void findElement(int a[],int num)
		{	
			boolean ispresent = false;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==num)
				{
					ispresent=true;
					break;
				}
			}
			if(ispresent)
			{
				System.out.println("Element is Present");
			}
			else
			{
				System.out.println("Element is not present");
			}
		}
		
		
		
		
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			
			int a[] = {1,2,3,4,5};
			
			System.out.println(Arrays.toString(a));
			System.out.println("Enter the Element for find :");
			int num=sc.nextInt();
			
			Element_present e=new Element_present();
			e.findElement(a, num);
			
		}
	
	
}
