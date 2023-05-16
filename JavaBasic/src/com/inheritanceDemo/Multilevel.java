package com.inheritanceDemo;

class Person
{
	String name;
	public void eat()
	{
		System.out.println("Person is eating");
	}
}

class Employee extends Person
{
	int salary;
	public void Detils()
	{
		name="Vijay";
	}
	public void showDetails()
	{
		System.out.println(name);
	}
}

class Manager extends Employee
{
	int insentive;
	public void assignSalary()
	{
		salary=70000;
		insentive=7000;
	}
	public void totalSalary()
	{
		salary=salary+insentive;
	}
	public void showEmployeeDetail()
	{
		System.out.println(name+" "+salary);
	}
	
	
}

public class Multilevel 
{
		public static void main(String[] args) {
			
			Manager m=new Manager();
			m.eat();
			m.Detils();
			m.showDetails();
			m.assignSalary();
			m.totalSalary();
			m.showEmployeeDetail();
		}
}
