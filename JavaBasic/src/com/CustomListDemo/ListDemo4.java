package com.CustomListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee
{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

class MyIdComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.id - e2.id;
	}
	
}

class MySalComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
	
		return o1.salary - o2.salary;
	}
	
}






public class ListDemo4 
{

		public static void main(String[] args)
		{
			ArrayList<Employee> al = new ArrayList<>();
			
			al.add(new Employee(200,"yash",56000));
			al.add(new Employee(101,"amit",45000));
			al.add(new Employee(102,"ram",78000));
			
			for(Employee e: al)
			{
				System.out.println(e);
			}
			
			System.out.println("///////////////////");
			
			Collections.sort(al,new MySalComparator());
			for(Employee e: al)
			{
				System.out.println(e);
			}
		}
	
	
	
	
}
