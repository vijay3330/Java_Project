package com.inheritanceDemo;

class Emp
{
	int salary = 40000;
	public void showEmp()
	{
		System.out.println("Employee fixed salary ");
	}
}

class PermanentEmp extends Emp
{
	public void showPemp()
	{
		int hike = 5000;
		salary=salary+hike;
		System.out.println(salary);
	}
}
class TemporaryEmp extends Emp
{
	public void showTempEmp()
	{
		int hike = 2000;
		salary=salary+hike;
		System.out.println(salary);
	}
}


public class Hierarchica3 
{

	public static void main(String[] args) 
	{
		PermanentEmp p=new PermanentEmp();
		p.showEmp();
		p.showPemp();
		
		TemporaryEmp t=new TemporaryEmp();
		t.showEmp();
		t.showTempEmp();
	}
	
}
