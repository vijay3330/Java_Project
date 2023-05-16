package com.lab_assignment;

public class Employee 
{
	/*
	 * Q1) Write Employee Class with attributes like employee_id, name, and salary. 
	 * Create parameterized constructor to initialize this 3 attributes, 
	 * and write a method to display this information of 5 objects, display total no of employees using static method,
	 *  totalEmp(), which will return total no of employees.

	 */
	int employee_id;
	String name;
	double salary;
	
	public Employee(int employee_id, String name, double salary)
	{
		this.employee_id=employee_id;
		this.name=name;
		this.salary=salary;
		
	}
	
	public void display()
	{
		System.out.println("Employee ID: "+employee_id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+salary);
		
	}
	
	public static int totalEmp(int total_emp)
	{
		return total_emp;
	}
	public static void main(String [] args)
	{
		Employee e=new Employee(330,"Vijay",70000.00);
		e.display();
		System.out.println(totalEmp(3));
	}
	
	
}
