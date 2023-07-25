package com.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

import com.setdemo.TreeSetDemo;

//class Mycom implements  Comparator<Movie>
//{
//
//	@Override
//	public int compare(Movie o1, Movie o2) {
//		
//		return  o2.rating.compareTo(o1.rating);
//	}
//	
//}
public class Movie implements Comparable<Movie>
{

	int m_id;
	String m_name;
	Float rating;
	
	public Movie(int m_id, String m_name, float rating) {
		super();
		this.m_id = m_id;
		this.m_name = m_name;
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Movie [m_id=" + m_id + ", m_name=" + m_name + ", rating=" + rating + "]";
	}
	

	
	public static void main(String[] args) {
		
		
		 HashSet<Movie> hs=new HashSet<>();
		 
		 hs.add(new Movie(101,"RRR",9.0f));
		 hs.add(new Movie(102,"Kgf",8.5f));
		 hs.add(new Movie(103,"Spiderman",7.5f));
		 
		 System.out.println(hs);
		 
		 TreeSet<Movie> tr=new TreeSet<>();
		tr.addAll(hs);
		 
		System.out.println(tr);
		 
	}

	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.rating.compareTo(o.rating);
	}


	
	
}
