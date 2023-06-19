package com.hashmapdemo;

import java.util.HashMap;

public class HashMapDemo 
{
				public static void main(String[] args) 
				{
					HashMap<Integer, String> map= new HashMap<>();
					
					map.put(1, "Amey");
					map.put(2, "Vijay");
					map.put(3, "Suraj");
					map.put(3, "Sam");
					
					map.put(null, "Unknown");
					map.put(5, null);
					map.put(6, null);
					map.put(7, "Vijay");
					
					System.out.println(map);
			
					//value acc to get key
					
					System.out.println("Value :"+map.get(null));
					
					System.out.println("Checks Key:"+map.containsKey(9));
					
					System.out.println("Cheks Value:"+map.containsValue("sam"));
					
					System.out.println(map.putIfAbsent(9, "Kim"));
					
					System.out.println(map);
					
					
					
					
				}
}
