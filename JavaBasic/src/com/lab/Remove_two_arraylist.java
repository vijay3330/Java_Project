package com.lab;

import java.util.ArrayList;

public class Remove_two_arraylist 
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
			System.out.println(al2);
			
			
			al.removeAll(al2);
			System.out.println(al);
			
		}
	
	
}
