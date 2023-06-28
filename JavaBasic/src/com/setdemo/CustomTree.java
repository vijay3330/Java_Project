package com.setdemo;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Student
{
	int id;
	String name;
	int marks;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
public class CustomTree 
{
	public static void main(String[] args) 
	{
		TreeSet<Student> ts=new TreeSet<>(new MystudCom());
		
		Scanner sc=new Scanner(System.in);
		for(int i=1; i<=3; i++)
		{
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter name");
			String nm = sc.next();
			System.out.println("Enter the marks");
			int mk = sc.nextInt();
			Student s = new Student();
			s.setId(id);
			s.setName(nm);
			s.setMarks(mk);
			
			ts.add(s);
	
		}
		
		System.out.println(".............................................");
		
		for(Student s: ts)
		{
			System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
		}
	}
}

class MystudCom implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2)
	{
		return o1.marks - o2.marks;
	}

	
	
}
