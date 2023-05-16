package com.inheritanceDemo;

class Grandmother
{
	public void showGrndmother()
	{
		System.out.println("Grandmother has own paint house in USA");
	}
}

class Mother extends Grandmother
{
	public void showMother()
	{
		System.out.println("Mother has own car");
	}
}

class Grandchild extends Mother
{
	public void showGrndchild()
	{
		System.out.println("Grandchild has own mobile");
	}
}



public class Multilevel2 
{
	
	public static void main(String[] args) {
		
		Grandchild g=new Grandchild();
		g.showGrndmother();
		g.showMother();
		g.showGrndchild();
		
	}

}
