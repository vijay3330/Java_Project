package com.raksha_mam;

import java.util.TreeMap;

public class EmployeeMain 
{
			TreeMap<Employee, String> tm=new TreeMap<>(new EmployeeNameComparator());
			
			void addData()
			{
				tm.put(new Employee(10,"Raj","HR",70000), "9784561230");
				tm.put(new Employee(7,"Rajvir","sales",60000), "9777561230");
				tm.put(new Employee(34,"Rushikesh","Admin",770000), "9784361230");
				tm.put(new Employee(15,"Abhishek","Devloper",44000), "9785561230");
				tm.put(new Employee(22,"Amey","HR",80000), "9784520230");
				tm.put(new Employee(82,"Akshat","Sales",74000), "9784555230");
				tm.put(new Employee(30,"Suraj","Opertions",90000), "9784561231");
				
				System.out.println(tm);
			}
			
			public static void main(String[] args) 
			{
				EmployeeMain obj=new EmployeeMain();
				obj.addData();
				
			}
}
