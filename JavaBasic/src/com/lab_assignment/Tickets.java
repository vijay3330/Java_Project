package com.lab_assignment;

public class Tickets 
{
	private	int tiketid;
	private	int price;
	private	static int availabletickets;
	
	public void setTicketid(int tiketid)
	{
		this.tiketid=tiketid;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public void setAvailabletickets(int availabletickets)
	{
		this.availabletickets=availabletickets;
		if(availabletickets>0)
		{
			
			
		}
	}
	
	public int getTicketid()
	{
		return tiketid;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public int getAvailabletickets()
	{
		return availabletickets;
	}
	
	
//	public int calculateTicketCost(int nooftickets)
//	{
//		if(availabletickets>=1)
//		{
//			nooftickets=availabletickets - nooftickets;
//			int total_amount = nooftickets*price;
//		}
//		else
//		{
//			return -1;
//		}
//		return total_amount;
//	}
	
		
}
