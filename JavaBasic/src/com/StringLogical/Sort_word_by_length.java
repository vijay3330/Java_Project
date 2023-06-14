package com.StringLogical;

public class Sort_word_by_length 
{
			
			public static void main(String[] args) 
			{
				String s="I Love UK Country";
				
			    String[] a = s.split(" ");
			    
			    for(int i=0; i<a.length; i++)
			    {
			    	for(int j=i+1; j<a.length; j++)
			    	{
			    		if(a[i].length() > a[j].length())
			    		{
			    			String temp=a[i];
			    			a[i]=a[j];
			    			a[j]=temp;
			    		}
			    	}
			    	 	 
			    }
			    
			    for(int k=a.length-1; k>=0; k--)
		    	 {
		    		 System.out.print(a[k]+" ");
		    	 }
			    
			   
			}
	
	
	
	
}
