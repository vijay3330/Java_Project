package com.lab_assignment;

public class Employee_1_display 
{
		public static void main(String[] args) {
			
			Employee_1 e1=new Employee_1();
			e1.setId(101);
			e1.setName("Rohit");
			e1.setSalary(50000);
			
			System.out.println(e1.getId());
			System.out.println(e1.getName());
			System.out.println(e1.getSalay());
			
		}
}
