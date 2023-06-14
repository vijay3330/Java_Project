package com.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Convert_ArrayList_to_Array 
{
		public static void main(String[] args) 
		{
			ArrayList<Character> al= new ArrayList<>();
			al.add('y');
			al.add('c');
			al.add('p');
			System.out.println(al);
			
			//way1
			
			Object a[] = al.toArray();
			System.out.println(Arrays.toString(a));
			
			//way2
			
			Character ch[] = al.toArray(new Character[al.size()]);
			
			for(int i=0; i<ch.length; i++)
			{
				System.out.println(ch[i]);
			}
			
			//way3
			
			Character c[] = new Character[al.size()];
			
			for(int i=0; i<c.length; i++)
			{
				c[i]=al.get(i);
			}
			
			for(Character cc : c)
			{
				System.out.println(cc);
			}
		}
}
