package com.CustomListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListDemo2 
{

	public static void main(String[] args)
	{
		ArrayList<Integer> al= new ArrayList<>();
		al.add(45);
		al.add(12);
		al.add(67);
		al.add(89);
		al.add(23);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		ArrayList<Student> list=new ArrayList<>();
		
		list.add(new Student(1,"nikhil",67));
		list.add(new Student(4,"amit",56));
		list.add(new Student(2,"sonia",78));
		
		for(Student s:list)
		{
			System.out.println(s);
		}
		
		System.out.println("---------------------------");
		
		Collections.sort(list);
		
		for(Student s:list)
		{
			System.out.println(s);
		}
		
	}
	
	
	
	
}
