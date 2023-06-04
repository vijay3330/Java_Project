package com.stringDemo;

public class Var_Argument 
{
			public void show(String str, int ...a)	//var argument use only once in the mentod and use aways last paramrter
			{
				System.out.println(str+"..........");
				for(int x:a)
				{
					System.out.println(x);
				}
				System.out.println();
			}
			
	
			public static void main(String[] args)
			{
				Var_Argument v=new Var_Argument();
				v.show("Pune", 12);
				v.show("Mumbai", 5,6,7,8,9);
				v.show("Satara", 11);
				
			}
	
	
}
