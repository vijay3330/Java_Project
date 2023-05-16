package com.lab_assignment;

public class Student 
{
	String name;
	int age;
	String address;
	
	public void set_Info(String name, int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	public void set_Info(String name, int age, String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
		
	}
	
	public static void main()
	{
		Student s=new Student();
		s.set_Info("Vijay", 25);
		s.set_Info("Rushikesh", 28, "Vita");
		
	}
}
