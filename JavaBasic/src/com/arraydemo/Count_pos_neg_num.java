package com.arraydemo;

import java.util.Arrays;

public class Count_pos_neg_num 
{
		public static void countPos_neg(int a[])
		{	int pcount=0;
			int ncount=0;
			for(int i=0; i<a.length; i++)
			{
				if(a[i] > 0)
				{
					pcount++;
				}
				if(a[i] < 0)
				{
					ncount++;
				}
			}
			System.out.println("Postive Number Count = "+pcount);
			System.out.println("Negative Number Count = "+ncount);
			
		}
	
		public static void main(String [] args)
		{
			int a[] = {4,-3,5,7,-2};
			
			System.out.println(Arrays.toString(a));
			
			Count_pos_neg_num.countPos_neg(a);
		}
	
}
