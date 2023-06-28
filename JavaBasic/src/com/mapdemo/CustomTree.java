package com.mapdemo;

import java.util.TreeMap;

class Employee implements Comparable<Employee>
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
	public int compareTo(Employee o) {

		return o.salary - this.salary;
	}
	
}
public class CustomTree 
{
	public static void main(String[] args) 
	{
		TreeMap<Employee, String> hm= new TreeMap<>();
		hm.put(new Employee(103,"a", 89000), "HR");
		hm.put(new Employee(101,"b",90000), "Sales");
		hm.put(new Employee(103,"a",89000), "Admin");
		
		System.out.println(hm);
		
	}
	
	
	
		
}
