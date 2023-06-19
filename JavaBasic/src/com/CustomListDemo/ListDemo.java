package com.CustomListDemo;

import java.util.ArrayList;

class Course
{
	int cid;
	String cname;
	int fees;
	public Course(int cid, String cname, int fees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", fees=" + fees + "]";
	}
	
	
	
}


class Stud
{
	int id;
	String name;
	Course cs;
	public Stud(int id, String name, Course cs) {
		super();
		this.id = id;
		this.name = name;
		this.cs = cs;
	}
	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", cs=" + cs + "]";
	}
	
	
}


public class ListDemo 
{
		
		public static void main(String[] args) 
		{
			ArrayList<Stud> al=new ArrayList<>();
			al.add(new Stud(300,"geeta", new Course(10,"Java",56000)));
			al.add(new Stud(100,"amit", new Course(40,"Python",66000)));
			al.add(new Stud(201,"nikhil", new Course(20,"SQL",45000)));
			
			
			
			
		}
	
	
}	
