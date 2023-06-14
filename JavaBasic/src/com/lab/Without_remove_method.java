package com.lab;

import java.util.ArrayList;
import java.util.Iterator;

public class Without_remove_method 
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
			
			System.out.println(al);
			System.out.println("-----------------------------");
			
			ArrayList<String> al2=new ArrayList<>();
			al2.add("pink");
			al2.add("red");
			al2.add("black");
			System.out.println(al2);
			System.out.println("----------------------");
			
			for(int i=0; i<al.size(); i++)
			{
				for(int j=0; j<al2.size(); j++)
				{
					if(al.get(i).equals(al2.get(j)))
					{
						al.remove(al.get(i));
						al2.remove(al2.get(j));
					}
				}
			}
			
			Iterator<String> itr= al.iterator(); 
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			System.out.println("------------------------");
			Iterator<String> itr2= al2.iterator(); 
			while(itr2.hasNext())
			{
				System.out.println(itr2.next());
			}
		}
}
