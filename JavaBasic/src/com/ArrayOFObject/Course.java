package com.ArrayOFObject;

import java.util.Scanner;

class Student
{
	int sid;
	String sname;
	int marks;
	public Student(int sid, String sname, int marks)
	{
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "sid="+ sid + ", sname=" + sname + ", marks=" + marks ;
	}
	
	
}


public class Course
{
		int cid;
		String cname;
		Student std;
		public Course(int cid, String cname, Student std) {
			super();
			this.cid = cid;
			this.cname = cname;
			this.std = std;
		}
		@Override
		public String toString() {
			return "Course [cid=" + cid + ", cname=" + cname + ", std=" + std + "]";
		}
		
		public static void main(String[] args) 
		{
			
			Course c[]= new Course[2];
			Scanner sc=new Scanner(System.in);
			
			for(int i=0; i<c.length;i++)
			{
				System.out.println("Enter Course id");
				int cid=sc.nextInt();
				System.out.println("Enter Course name");
				String cname=sc.next();
				System.out.println("Enter Students Details");
				System.out.println("Enter Student id");
				int sid=sc.nextInt();
				System.out.println("Enter Student Name");
				String sname=sc.next();
				System.out.println("Enter Student Marks");
				int marks=sc.nextInt();
				
				c[i] = new Course(cid,cname,new Student(sid,sname,marks));
			}
			
			System.out.println("...............................");
			
			for(int i=0; i<c.length;i++)
			{
				System.out.println(c[i]);
			}
			
			System.out.println("..................................");
			//find the course which has students with marks more than 70
			
			for(int i=0;i<c.length;i++)
			{
				if(c[i].std.marks>70)
				{
					System.out.println(c[i]);
				}
			}
		}
	
	
}
