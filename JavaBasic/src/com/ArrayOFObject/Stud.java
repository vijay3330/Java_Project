package com.ArrayOFObject;

import java.util.Arrays;
import java.util.Scanner;

public class Stud 
{
	int id;
	String name;
	int marks[];
	
	public Stud(int id,String name,int marks[])
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public 	String toString()
	{
		return id+" "+name+" "+Arrays.toString(marks);
	}
	
	
	public static void main()
	{
		Stud st[]=new Stud[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<st.length;i++)
		{
			System.out.println("Enter the sid");
			int sid=sc.nextInt();
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter Marks");
			int mk[] = new int[2];
			for(int j=0;j<mk.length;j++)
			{
				mk[j]= sc.nextInt();
			}
			
			st[i]= new Stud(sid,name,mk);
		}
		
		
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		
		System.out.println(".......................");
		
		for(Stud s:st)
		{
			System.out.println(s);
		}
		
		System.out.println("............................");
		
		
		//find the students who get more than 60
//		for(int i=0;i<st.length;i++)
//		{
//			if(st[i].marks > 60)
//			{
//				System.out.println(st[i]);
//			}
//		}
	}
	
	
	
	
}
