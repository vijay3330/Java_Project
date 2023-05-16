package com.containment;

public class Concrete_Person
{
		
		public static void main(String[] args) 
		{
			Person p=new Person();
			
			p.setPid(3330);
			p.setName("Vijay");
			p.setAdr(new Address());
			
			Address a = p.getAdr();
			a.setPincode(45002);
			a.setCity("Satara");
			
			System.out.println(p.getPid());
			System.out.println(p.getName());
			System.out.println(a.getPincode());
			System.out.println(a.getCity());
			
			
		}
}
