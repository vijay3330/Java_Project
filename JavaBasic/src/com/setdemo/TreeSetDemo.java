package com.setdemo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo 
{
		public static void main(String[] args)
		{
			TreeSet<Integer> ts=new TreeSet<>(new Mycom());
			ts.add(89);
			ts.add(23);
			ts.add(67);
			ts.add(24);
			
			System.out.println(ts);
			
			
			
		}
}

class Mycom implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o1 - o2;
	}
	
}
