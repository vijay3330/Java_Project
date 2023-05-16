package com.algo;

public class Calculate_discounted_price {

	public static void main(String[] args) 
	{
		double price, disc, discprice;
		
		price=34250;
		
		if(price < 10000)
		{
			disc=(price * 5) / 100;
			System.out.println("discount: "+disc);
			discprice= price - disc;
			System.out.println("discounted price:"+discprice);
		}
		else if(price > 10000 && price < 25000)
		{
			disc=(price * 10) / 100;
			System.out.println("discount: "+disc);
			discprice= price - disc;
			System.out.println("discounted price:"+discprice);
		}
		else if(price > 25000 && price < 50000)
		{
			disc=(price * 15) / 100;
			System.out.println("discount: "+disc);
			discprice= price - disc;
			System.out.println("discounted price:"+discprice);
		}
		else if(price > 50000 )
		{
			disc=(price * 20) / 100;
			System.out.println("discount: "+disc);
			discprice= price - disc;
			System.out.println("discounted price:"+discprice);
		}
		else
		{
			System.out.println("invalid discount ");
		}
		

	}

}
