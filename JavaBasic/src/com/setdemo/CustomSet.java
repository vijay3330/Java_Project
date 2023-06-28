package com.setdemo;

import java.util.HashSet;
import java.util.Objects;

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
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object o) 
	{
		Employee e=(Employee) o;
		
		if(this.id==e.id)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}

public class CustomSet 
{
		public static void main(String[] args)
		{
			
			HashSet<Employee> hm=new HashSet<>();
			hm.add(new Employee(101,"yash",56000));
			hm.add(new Employee(100,"Amit",80000));
			hm.add(new Employee(103,"neha",78000));
			hm.add(new Employee(101,"nikhil",45000));
			
			for(Employee e:hm)
			{
				System.out.println(e);
			}

			
			
			
		}
}
