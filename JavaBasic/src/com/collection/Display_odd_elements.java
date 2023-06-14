package com.collection;

import java.util.ArrayList;

public class Display_odd_elements
{
		
	public static void main(String[] args) 
	{
		ArrayList<Integer> al= new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
		for(int i=0; i<al.size(); i++)
		{
			if(al.get(i)%2==1)
			{
				System.out.println("Odd Elements are : "+al.get(i));
			}
		}
	}
}
