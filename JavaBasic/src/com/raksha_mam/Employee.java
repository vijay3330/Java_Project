package com.raksha_mam;

public class Employee implements Comparable<Employee>
{
		int id;
		String name;
		String dname;
		int salary;
		
		public Employee(int id, String name, String dname, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.dname = dname;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", dname=" + dname + ", salary=" + salary + "]";
		}

		@Override
		public int compareTo(Employee e) {
			
			return this.id - e.id;
		}
		
		
		
		
		
}
