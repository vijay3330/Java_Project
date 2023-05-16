package com.loops;

public class Skip_number {

		//Skip number;
	public static void main(String[] args)
	{
		for(int i=1;i<=50;i++)
		{
			if(i%3==0 && i%5==0)
			{
				continue;
			}
			else
			{
				System.out.println(i);
			}
		}

	}

}
