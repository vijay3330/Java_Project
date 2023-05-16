package com.encapsulation;

public class Car 
{
	
	private String model_no;
	private String cname;
	private int slimit;
	
	public void setModel_no(String model_no)
	{
		this.model_no=model_no;
	}
	
	public void setCname(String cname)
	{
		this.cname=cname;
	}
	
	public void setSlimit(int slimit)
	{
		if(slimit >= 80)
		{
			System.out.println("Car speed is more than 80");
		}
		else
		{
		this.slimit=slimit;
		}
	}
	
	public String getModel_no()
	{
		return model_no;
	}
	
	public String getCname()
	{
		return cname;
	}
	
	public int getSlimit()
	{
		return slimit;
	}
	
	
	
	
	
}
