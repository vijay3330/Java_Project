package com.lab;

import java.util.ArrayList;
import java.util.Iterator;

public class Duplicate 
{
		
		public static void main(String[] args) 
		{
			ArrayList<String> al=new ArrayList<>();
			al.add("red");
			al.add("black");
			al.add("blue");
			al.add("red");
			al.add("brown");
			al.add("black");
			al.add("yellow");
			al.add("green");
			
			Iterator<String> itr= al.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			System.out.println("-----------------------------------");
			
			for(int i=0; i<al.size(); i++)
			{
				String s= al.get(i);
				for(int j=i+1; j<al.size(); j++)
				{
					if(s.equals(al.get(j)))
					{
						al.remove(j);
					}
				}
			}
			
			System.out.println("------------------------------------");
			
			Iterator<String> itr1= al.iterator();
			while(itr1.hasNext())
			{
				System.out.println(itr1.next());
			}
		}
	
	
}
