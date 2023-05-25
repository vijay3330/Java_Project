package com.ArrayOFObject;

import java.util.Arrays;
import java.util.Scanner;

class Emp
{
	int id;
	String name;
	int salary;
	
	public Emp(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary ;
	}
	
	
	
}
public class Department 
{
	
	int did;
	String dname;
	Emp e[];
	
	public Department(int did, String dname, Emp[] e) {
		super();
		this.did = did;
		this.dname = dname;
		this.e = e;
	}

	@Override
	public String toString() {
		return "did=" + did + ", dname=" + dname + ", e=" + Arrays.toString(e);
	}
	
	public static void main(String[] args) 
	{
		Department dt[]= new Department[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<dt.length;i++)
		{
			System.out.println("Enter the department id");
			int did=sc.nextInt();
			System.out.println("Enter the department name");
			String dname=sc.next();
			System.out.println("Enter the number of employee");
			int n=sc.nextInt();
			Emp e[]=new Emp[n];
			System.out.println("Enter Employee Details");
			for(int j=0;j<e.length;j++)
			{
				System.out.println("Enter Employee id");
				int id=sc.nextInt();
				System.out.println("Enter Employee name ");
				String name=sc.next();
				System.out.println("Enter Employee Salary");
				int salary=sc.nextInt();
				
				e[j]=new Emp(id,name,salary);
			}
			
			dt[i]=new Department(did,dname,e);
		}
		
		for(Department d:dt)
		{
			System.out.println(d);
		}
		
		
	}
	
	
}
