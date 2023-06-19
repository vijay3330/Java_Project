package com.lab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class Student
{
	int id;
	String name;
	int per;
	public Student(int id, String name, int per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
	
	
}

public class HashmapExample 
{
			public static void main(String[] args) 
			{
				ArrayList<Student> al=new ArrayList<>();
				HashMap<String, String> hs=new HashMap<>();
				
				al.add(new Student(1,"Vijay",90));
				al.add(new Student(2,"Rushikesh",95));
				al.add(new Student(3,"Amey",80));
				al.add(new Student(4,"Atul",30));
				al.add(new Student(5,"Suraj",40));
				
				String s;
				 Iterator<Student> itr = al.iterator();
				 while(itr.hasNext())
				 {
					 Student s1=itr.next();
					 if(s1.per<=100 && s1.per>=35)
					 {
						 s="Pass";
						 hs.put(s1.name, s);
					 }
					 else
					 {
						s="fail";
						hs.put(s1.name, s);
					 }
					 
				 }
					 
				System.out.println(hs);
				
				
				
				
			}
}
