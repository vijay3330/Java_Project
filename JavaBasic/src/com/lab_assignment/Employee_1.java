package com.lab_assignment;

public class Employee_1 
{
	/* 
	 * Q2)Create one class Employee (id , name, salary) with private access modifier and create getter and setter.
	 */
	
	private int id;
	private String name;
	private int salary;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getSalay()
	{
		return salary;
	}
	
}
