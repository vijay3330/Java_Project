package com.Assignment_on_array;

import java.util.Scanner;

public class Givennum_index 
{
				public void numCheck(int a[])
				{
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter the number for check");
					int num=sc.nextInt();
					
					for(int i=0 ; i<a.length ; i++)
					{
						
							if(a[i]==num)
							{
								System.out.println("Given Number= "+a[i]+" "+"Index Of Number= "+ i);
							}
						
					}
				}
	
			public static void main(String[] args) 
			{
				
				int a[]= {10,20,30,40,50};
				
				Givennum_index g=new Givennum_index();
				g.numCheck(a);
				
				
			}
}
