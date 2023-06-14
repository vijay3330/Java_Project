package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo1 
{
		
		public static void main(String[] args) 
		{
			LinkedList<String> ls=new LinkedList<>();
			ls.add("java");
			ls.add("c++");
			ls.add("python");
			ls.addFirst("C");
			ls.add("java");
			
			System.out.println(ls);
			
			ls.removeFirst();	// remove first element
			System.out.println(ls);
			
			ls.offer("SQL");	//add element to last 
			System.out.println(ls);
			
			ls.offerFirst(".Net");	// add element to first in linkedlist
			System.out.println(ls);
			
			System.out.println(ls.pollLast());	// Remove last element
			
			System.out.println(ls);
			
			System.out.println(ls.pollFirst());
			
			System.out.println(ls); 	// Remove First Element
			
			ArrayList<String> al= new ArrayList<>(ls); //convert LinkedList to ArrayList
			System.out.println(al);
			
			for(int i=0;i<al.size();i++)	//print by forloop
			{
				System.out.println(al.get(i));
			}
			
		}
	
	
}
