package com.Abstract;

abstract class Admission
{
	abstract void fill_form();
		
}

abstract class OnlineAdmission extends Admission
{
	public void fill_From_Url()
	{
		System.out.println("URL");
	}
}

class Registration extends OnlineAdmission
{
	public void fill_form()
	{
		System.out.println("Form completed addmission done.... ");
	}
}

public class AbstractDemo4 
{
	public static void main(String[] args) {
		
		Registration r=new Registration();
		r.fill_From_Url();
		r.fill_form();
		
		
	}
}
