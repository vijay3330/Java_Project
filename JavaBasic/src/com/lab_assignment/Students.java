package com.lab_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Students 
{
			int roll_no;
			String name;
			int age;
			int marks;
			
			
			public Students(int roll_no, String name, int age, int marks) {
				super();
				this.roll_no = roll_no;
				this.name = name;
				this.age = age;
				this.marks = marks;
			}
			
			
			@Override
			public String toString() {
				return "Students [roll_no=" + roll_no + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
			}


			public static void display(Students s[])
			{
				for(int i=0;i<s.length;i++)
				{
					if(s[i].marks > 60 && s[i].age < 15)
					{
						System.out.println(s[i]);
					}
				}
			}
			
			

			public static void main(String[] args)
			{
				Students s[]=new Students[4];
				
				Scanner sc=new Scanner(System.in);
				for(int i=0;i<s.length;i++)
				{
					System.out.println("Enter Student Roll No ");
					int sroll=sc.nextInt();
					System.out.println("Enter Student Name");
					String sname=sc.next();
					System.out.println("Enter Student Age");
					int sage=sc.nextInt();
					System.out.println("Enter Student Marks");
					int smarks=sc.nextInt();
					
					s[i]=new Students(sroll,sname,sage,smarks);

				}
				
				System.out.println(Arrays.toString(s));
				
				System.out.println("-------------------------");
				
				display(s);
				
				
				
				
			}
}
