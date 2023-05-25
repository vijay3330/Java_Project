package com.ArrayOFObject;

import java.util.Scanner;

public class Students 
{
	int sid;
	String sname;
	int marks;
	
	Students(int sid,String sname,int marks)
	{
		this.sid=sid;
		this.sname=sname;
		this.marks=marks;
	}
	
	public String toString()
	{
		return sid+" "+sname+" "+marks;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		Students st[]=new Students[3];
		
		for(int i=0;i<st.length;i++)
		{
			System.out.println("Enter Student id");
			int sid=sc.nextInt();
			System.out.println("Enter Student name");
			String sname=sc.next();
			System.out.println();
			System.out.println("Enter Student marks");
			int marks=sc.nextInt();
			
			st[i]=new Students(sid,sname,marks);
		}
		
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		
		System.out.println("...............");
		
		for(Students s : st)
		{
			System.out.println(s);
		}
	}
	
}
