package com.collection;

import java.util.ArrayList;

public class Avg_even_elements 
{

	
	public static void main(String[] args)
	{
		ArrayList<Integer> al= new ArrayList<>();
		
		al.add(6);
		al.add(7);
		al.add(4);
		al.add(9);
		al.add(2);
		al.add(1);
		
		int count=0;
		int sum=0;
		int avg=0;
		for(int i=0; i<al.size(); i++)
		{
			if(al.get(i)%2==0)
			{
				count++;
				sum=sum+al.get(i);
				
			}
		
		}
		avg=sum/count;
		System.out.println(avg);
		
	}
	
	
	
}
