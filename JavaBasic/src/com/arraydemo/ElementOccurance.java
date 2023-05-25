package com.arraydemo;

import java.util.Arrays;

public class ElementOccurance 
{		
			public void findOccurance(int a[])
			{
				for(int i=0;i<a.length;i++)
				{
					boolean isvisited=false;
					int count=1;
					
					for(int j=i-1; j >= 0; j--)
					{
						if(a[i]==a[j])
						{
							isvisited =true;
							break;
						}
					}
					if(isvisited==false)
					{
						for(int k=i+1;k<a.length;k++)
						{
							if(a[i]==a[k])
							{
								count++;
							}
						}
						System.out.println(a[i]+" "+count);
					}
				}
			}

			public static void main(String[] args) 
			{
				int a[]= {1,4,1,3,6,4,4};
				System.out.println(Arrays.toString(a));
				
				ElementOccurance e=new ElementOccurance();
				e.findOccurance(a);
				
			}
	
	
}
