package com.containment;

public class Sipment_main 
{
		
	public static void main(String [] args)
	{
		Shipment s=new Shipment();
		
		
		s.set_Shipmentid(101);
		s.set_Ord(new Order());
		s.set_Date(new Mydate());
		
		Order o = s.get_Ord();
		
		o.setOrder_id1(777);
		o.setCust_id1(33);
		o.setCityname1("SATARA");
		
		 Mydate m =s.get_Date();
		 m.set_Mm(03);
		 m.set_Dd(28);
		 m.set_Yy(23);
		 
		 System.out.println(s.get_Shipmentid());
		 System.out.println(o.getOrder_id1());
		 System.out.println(o.getCust_id1());
		 System.out.println(o.getCityname1());
		 System.out.println(m.get_Mm()+" "+m.get_Dd()+" "+m.get_Yy());
		 
		 
		 
		 
		
		
		
		
	}
	
	
}
