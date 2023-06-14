package com.exceptionhandling;

import java.util.ArrayList;

public class Sort_Arraylist 
{
			
			public static void main(String[] args) 
			{
					
				ArrayList<Integer> al=new ArrayList<>();
				al.add(7);
				al.add(7);
				al.add(20);
				al.add(65);
				al.add(15);
				al.add(40);
				
				for(int i=0; i<al.size();i++)
				{
					
					for(int j=i+1; j<al.size();j++)
					{
						Integer t1= al.get(i);
						Integer t2= al.get(j);
						
						if(t1 > t2)
						{
							al.set(i, t2);
							al.set(j, t1);
						}
					}
					
				}
				
				System.out.println(al);
				
			}
	
	
}
