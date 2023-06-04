package com.exceptionhandling;

class Employ
{
	int id;
	String name;
	int salary;
	public Employ(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}



public class Test2 
{
			
				
				public static void main(String[] args)
				{
					Employ emp[]= new Employ[2];
					emp[0] = new Employ(101,"Vijay",70000);
					
					for(int i=0; i<emp.length ; i++)
					{
						try
						{
							if(emp[i].salary > 25000)
							{
								System.out.println(emp[i]);
							}
						}
						catch(Exception e)
						{
							
						}
						System.out.println("hiii");
					}
				}
	
		
}
