package com.lab;
class Nip
{
	String typenip;
	int nipprice;
	
	public Nip(String typenip, int nipprice)
	{
		this.typenip=typenip;
		this.nipprice=nipprice;
	}
	
	public String toString()
	{
		return typenip+" "+nipprice;
	}
	
	
}
class Pen 
{
	String pname;
	String pcolor;
	int pprice;
	Nip nip;
	
	public Pen(String pname, String pcolor, int pprice, Nip nip )
	{
		this.pname=pname;
		this.pcolor=pcolor;
		this.pprice=pprice;
		this.nip=nip;
	}
	
	public String toString()
	{
		return pname+" "+pcolor+" "+pprice+" "+nip+" ";
	}
}
public class Bag 
{
	String brandname;
	int bagprice;
	Pen pen;
	
	public Bag(String brandname, int bagprice, Pen pen)
	{
		this.brandname=brandname;
		this.bagprice=bagprice;
		this.pen=pen;
		
	}
	
	public String toString()
	{
		return brandname+" "+bagprice+" "+pen;
	}
	
	public static void main(String[] args) {
		
		Bag b=new Bag("SkyBags",1500,new Pen("Parker","Blue",400,new Nip("Broad",100)));
		
		System.out.println(b.brandname);
		System.out.println(b.bagprice);
		System.out.println(b.pen);
		
		
				
			
				
	}
	
	
}
