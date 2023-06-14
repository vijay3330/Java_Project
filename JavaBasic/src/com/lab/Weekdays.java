package com.lab;

import java.util.ArrayList;

public class Weekdays
{
		
	
			public static void main(String[] args) 
			{
				ArrayList<String> al=new ArrayList<>();
				al.add("monday");
				al.add("tuesday");
				al.add("wednesday");
				al.add("thursday");
				al.add("friday");
				al.add("saturday");
				al.add("sunday");
				
				for(int i=0;i<al.size();i++)
				{
					if(al.get(i).length() > 7)
					{
						al.remove(i);
						i--;
					}
				}
				
				System.out.println(al);
			}
	
}
