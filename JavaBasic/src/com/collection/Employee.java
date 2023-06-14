package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Employee 
{
		int eid;
		String ename;
		int esal;
		String edep;
		
		public Employee(int eid, String ename, int esal, String edep) 
		{
			super();
			this.eid = eid;
			this.ename = ename;
			this.esal = esal;
			this.edep = edep;
		}

		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edep=" + edep + "]";
		}
		
		public static void disSalary(ArrayList<Employee> e)
		{
			Iterator<Employee> itr= e.iterator();
			while(itr.hasNext())
			{
				Employee ob = (Employee) itr.next();
				
				if(ob.esal > 30000)
				{
					System.out.println(ob);
				}
			}
		}
		
		public static void empDep(ArrayList<Employee> e)
		{
			ListIterator<Employee> itr2=e.listIterator();
			
			while(itr2.hasNext())
			{
				Employee ob2 = (Employee) itr2.next();
				
				if(ob2.edep.equalsIgnoreCase("sales"))
				{
					System.out.println(ob2);
				}

			}
			
		}
		
		
		
		public static void main(String[] args)
		{
			ArrayList<Employee> e=new ArrayList<>();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no of employes ");
			int size=sc.nextInt();
			
			for(int i=1; i<=size; i++)
			{
				System.out.println("Enter Employee id");
				int eid=sc.nextInt();
				System.out.println("Enter Employee name");
				String ename=sc.next();
				System.out.println("Enter Employee salary");
				int esal=sc.nextInt();
				System.out.println("Enter Employee department");
				String edep=sc.next();
				
				  e.add(new Employee(eid, ename, esal,edep));
			}
			
			for(Employee ee:e)
			{
				System.out.println(ee);
			}
			
			System.out.println("----------------------------------");
			
			disSalary(e);
			empDep(e);
			
		}
		
		
		
}
