package com.CustomListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student implements Comparable<Student>
{
	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	@Override
	public String toString()
	{
		return "[id="+ id +", name="+ name +", marks="+ marks +"]";
	}

	@Override
	public int compareTo(Student s) 
	{
//		if(this.id > s.id)
//		{
//			return -1;	
//		}
//		else if(this.id < s.id)
//		{
//			return 1;
//		}
//		else
//		{
//			return 0;
//		}
		
//		return this.id-s.id;	// use to sort in descending
//		return s.id-this.id;	// use to sort in ascending
		return this.name.compareTo(s.name);  // use to sort by name in ascending
		
		
		
	}
}


public class CustomList1 
{
		
		public static void main(String[] args) 
		{
			ArrayList<Student> al=new ArrayList<>();
			
//			al.add(new Student(101,"Rohit",70)); // way1 for initilize and add elements
//			System.out.println(al);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("How many elements you want to add");
			int size=sc.nextInt();
			
			for(int i=1; i<=size; i++)
			{
				System.out.println("Enter the Student ID");
				int sid=sc.nextInt();
				System.out.println("Enter the student name");
				String sname=sc.next();
				System.out.println("Enter student marks");
				int smarks=sc.nextInt();
				
				al.add(new Student(sid,sname,smarks));
			}
			
			System.out.println("------------------------------");
			
			for(Student s:al)
			{
				System.out.println(s);
			}
			
			System.out.println("----------------------------");
			
//			Iterator<Student> itr= al.iterator();
//			while(itr.hasNext())
//			{
//				Student s=itr.next();
//				if(s.marks > 60)
//				{
//					System.out.println(s);
//				}
//			}
			
			Iterator<Student> itr=al.iterator();
			while(itr.hasNext())
			{
				Student s= (Student) itr.next();
				if(s.marks > 60)
				{
					System.out.println(s);
				}
				
			}
			
			
			
		}
	
	
}
