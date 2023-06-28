package com.mapdemo;

import java.util.Comparator;
import java.util.TreeMap;




public class TreeMapDemo 
{
			
		public static void main(String[] args)
		{
			TreeMap<Integer, String> hm=new TreeMap<>();
			hm.put(34,"pune");
			hm.put(90, "mumbai");
			hm.put(12, "pune");
			hm.put(13, "goa");
			
			System.out.println(hm);
			
			System.out.println("................................");
			
		//	System.out.println(hm.ceilingEntry(75));
			System.out.println(hm.ceilingEntry(34));
			System.out.println(hm.floorEntry(10));
			System.out.println(hm.higherEntry(34));
			System.out.println(hm.higherEntry(90));
			System.out.println(hm.headMap(34));
			System.out.println(hm.headMap(34, true));
			System.out.println(hm.subMap(13, 90));
			System.out.println(hm.subMap(13, true, 90, true));
			System.out.println(hm.firstEntry());
			 
			
			
			
		}
			
}

//class Mycom implements Comparator<Integer>
//{
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		
//		return o2 - o1;
//	}
	
//}