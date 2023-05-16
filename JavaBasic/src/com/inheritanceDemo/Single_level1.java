package com.inheritanceDemo;

class Television 
{
	int size;
}

class Sony extends Television
{
	public void shoSony()
	{	size=55;
		System.out.println("Sony is a brnad of Television available size "+ size + " inch");
	}
}


public class Single_level1 {

	public static void main(String[] args) {
		
		Sony s=new Sony();
		s.shoSony();
	}
	
}
