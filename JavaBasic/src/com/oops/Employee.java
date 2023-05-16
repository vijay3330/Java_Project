package com.oops;

public class Employee 
{
			int id;
			String name;
			double salary;
			int age;
			
			public Employee(int eid,String ename,double esal,int eage)
			{
				id=eid;
				name=ename;
				salary=esal;
				age=eage;
			}
			
			public void gtBouns()
			{
				System.out.println("Vijay Ghadge");
				if(age>60)
				{
					System.out.println("Salary With Bouns: "+(salary+5000));
				}
				
				if(age>40 && age<=60 )
				{
					System.out.println("Salary With Bouns: "+(salary+2000));
				}
				if(age<=40)
				{
					System.out.println("No bounus only salary"+" "+ salary);
				}
			}
			
			
			public static void main(String[] args) 
			{
				Employee e=new Employee(101,"rahul",50000.0,65);
				e.gtBouns();
						
			}
}
