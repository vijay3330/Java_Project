package com.oops;

public class Student
{
		String Stud_name;	
		int Stu_ID;
		int math;
		int history;
		int science;
		float per;
		
		public void stud_details(String sname,int Id,int maths,int hstry,int sc)
		{
			String Stud_name=sname;
			int Stu_ID=Id;
			int math=maths;
			int history=hstry;
			int science=sc;
			
		}
		
		public void percentage()
		{
			per=((math+history+science) / 300) * 100;
			
		}
		
		public void Stud_info_with_per()
		{
			System.out.println("Stundent Name: "+Stud_name+"\n"+"Stundent ID: "+Stu_ID+"\n"+"Maths Marks: "+math+"\n"+"History Marks: "+history+"\n"+"Science Marks: "+science);
			System.out.println(per);
			
		}
		
		public static void main(String[] args)
		{
			Student stud=new Student();
			stud.stud_details("Rushikesh Jadhav", 777, 70,60 ,80);
			stud.Stud_info_with_per();
		}
	
} 
