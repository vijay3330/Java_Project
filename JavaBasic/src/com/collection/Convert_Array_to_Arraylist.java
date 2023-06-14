package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Convert_Array_to_Arraylist 
{
		public static void main(String[] args) 
		{
			String city[] = {"pune", "mumbai", "nasik"};
			
			//way1
			
			ArrayList<String> al=new ArrayList<String>(Arrays.asList(city));
			System.out.println(al); 
			
			//way2
			
			ArrayList<String> al2= new ArrayList<>();
			Collections.addAll(al2, city);
			System.out.println(al2);
			
			//way3
			
			ArrayList<String> al3= new ArrayList<>();
			
			for(int i=0; i<city.length; i++)
			{
				al3.add(city[i]);
			}
			System.out.println(al3);
		}
		
		
}
