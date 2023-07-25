package com.collection;

import java.util.ArrayList;

public class Remove_sort_asc_desc_dublicate 
{
		
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("red");
		al.add("green");
		al.add("black");
		
		System.out.println(al);
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add("pink");
		al2.add("red");
		
		al.removeAll(al2); // remove the same elements present in both 
		
	//	System.out.println(al);
		System.out.println(al2);
		
		al.retainAll(al2); // commn keep as it is not comman remove
		System.out.println(al);
//		al2.addAll(al);
//		
//		System.out.println(al2);
//		
//		al2.retainAll(al);
//		
//		System.out.println(al2);
		
		
		
		
		
		
		
		

	}
	
	
}	
