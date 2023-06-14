package com.lab_assignment;

import java.util.Arrays;
import java.util.Scanner;

class Movie
{
	private int m_id;
	private String m_name;
	private float rating;
	public Movie(int m_id, String m_name, float rating) {
		super();
		this.m_id = m_id;
		this.m_name = m_name;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return " [m_id=" + m_id + ", m_name=" + m_name + ", rating=" + rating + "]";
	}
	
	
}

public class Theatre 
{
	private int t_id;
	private String t_name;
	private Movie m[];
	
	public Theatre(int t_id, String t_name, Movie[] m) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.m = m;
	}

	@Override
	public String toString() {
		return " [t_id=" + t_id + ", t_name=" + t_name + ", m=" + Arrays.toString(m) + "]";
	}
	
	
	public static void main(String[] args)
	{
		Theatre t[]=new Theatre[2];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<t.length; i++)
		{
			System.out.println("Enter theatre id");
			int t_id=sc.nextInt();
			System.out.println("Enter theatre name");
			String t_name=sc.next();
			Movie m[]=new Movie[2];
			
			for(int j=0;j<m.length;j++)
			{
				System.out.println("Enter movie id");
				int m_id=sc.nextInt();
				System.out.println("Enter movie name");
				String m_name=sc.next();
				System.out.println("Enter movie ratings");
				float rating=sc.nextFloat();
				
				m[j]=new Movie(m_id, m_name, rating);
			}
			
			t[i]=new Theatre(t_id, t_name, m );
		}
		
		for(Theatre tt:t)
		{
			System.out.println(tt);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
