package com.customhashmap;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap
{
		
			
			public static void main(String[] args) 
			{
				HashMap<Integer, Employee> emap= new HashMap<>();
				
				emap.put(101, new Employee(101,"Suraj",89000));
				emap.put(101, new Employee(102,"Akshat",99000));
				emap.put(101, new Employee(103,"Amey",189000));
				emap.put(101, new Employee(104,"Prasad",85000));
				emap.put(101, new Employee(105,"Mayur",100000));
				
				for(Map.Entry<Integer, Employee> en: emap.entrySet())
				{
					System.out.println(en.getKey());
					System.out.println(en.getValue());
				}
				
				System.out.println("====================================");
				
				emap.put(102, new Employee(102,"Vijay",79000));
				
				for(Map.Entry<Integer, Employee> en: emap.entrySet())
				{
					System.out.println(en.getKey());
					System.out.println(en.getValue());
				}
				
				
				
				
			}
		
}
