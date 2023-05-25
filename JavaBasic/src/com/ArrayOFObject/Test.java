package com.ArrayOFObject;

import java.util.Scanner;

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
	
	public String toString()
	{
		return id+" "+name+" "+salary;
		
	}
}



public class Test 
{
		
	public static void main(String[] args)
	{
		Employee emp[] = new Employee[3];
		
//		emp[0]=new Employee(101,"yash",67000);
//		emp[1]=new Employee(102,"sonia",77000);
//		emp[2]=new Employee(10,"Ram",50000);
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Enter the employee details");
			System.out.println("Enter the id");
			int id=sc.nextInt();
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the salary");
			int salary=sc.nextInt();
			
			emp[i]=new Employee(id,name,salary);
		}
		
		System.out.println(".......................");	
		
		for(int i=0;i<emp.length;i++)	// display with normal for loop  
		{
			System.out.println(emp[i].id+" "+emp[i].name+" "+emp[i].salary);
			//System.out.println(emp[i]);
		}
		
		System.out.println("........................");
		
		for(Employee e:emp)	// display with for each loop
		{
			System.out.println(e);
		}

		System.out.println(".......................");
		
		//find emp with salary more than 50000;
		
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i].salary>50000)
			{
				System.out.println(emp[i]);
			}
		}
		
		
	}	
	
	
}
