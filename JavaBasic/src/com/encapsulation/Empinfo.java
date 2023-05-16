package com.encapsulation;

public class Empinfo 
{
		public static void main(String [] args)
		{
			Employee emp=new Employee();
			
			emp.setId(123);
			emp.setName("Vijay");
			emp.setSalary(70000);
			
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
		}
}
