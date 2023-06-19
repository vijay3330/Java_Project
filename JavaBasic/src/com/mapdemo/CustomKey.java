package com.mapdemo;

import java.util.HashMap;
import java.util.Map;

class Student
{
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	@Override
	public int hashCode()
	{
		return id;
	}
	
	public boolean equals(Object o)
	{
		Student s= (Student) o;
		
		if(this.id==s.id)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
}

public class CustomKey 
{
			public static void main(String[] args)
			{
				HashMap<Student, Integer> hm=new HashMap<>();
				
				hm.put(new Student(1,"nikhil",78), 89);
				hm.put(new Student(2,"Sonia",78), 90);
				hm.put(new Student(1,"neha",78), 93);
				
				for(Map.Entry<Student, Integer> m : hm.entrySet())
				{
					System.out.println(m);
				}
				
				
				
			}
}
