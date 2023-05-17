package com.lab;

class PenNip
{
	String niptype1;
	int nipprice1;
	public String getNiptype1() {
		return niptype1;
	}
	public void setNiptype1(String niptype1) {
		this.niptype1 = niptype1;
	}
	public int getNipprice1() {
		return nipprice1;
	}
	public void setNipprice1(int nipprice1) {
		this.nipprice1 = nipprice1;
	}
	
	
}

class Pen1
{
	String colorname1;
	String penname1;
	int penprice1;
	PenNip pennip1;
	public String getColorname1() {
		return colorname1;
	}
	public void setColorname1(String colorname1) {
		this.colorname1 = colorname1;
	}
	public String getPenname1() {
		return penname1;
	}
	public void setPenname1(String penname1) {
		this.penname1 = penname1;
	}
	public int getPenprice1() {
		return penprice1;
	}
	public void setPenprice1(int penprice1) {
		this.penprice1 = penprice1;
	}
	public PenNip getPennip1() {
		return pennip1;
	}
	public void setPennip1(PenNip pennip1) {
		this.pennip1 = pennip1;
	}
	

}
public class Bag1 
{
		private String brandname1;
		private String bagprice1;
		private Pen1 pen1;
		public String getBrandname1() {
			return brandname1;
		}
		public void setBrandname1(String brandname1) {
			this.brandname1 = brandname1;
		}
		public void setBagprice1(String bagprice1) {
			this.bagprice1 = bagprice1;
		}
		public void setPen1(Pen1 pen1) {
			this.pen1 = pen1;
		}
		
		
		public Pen1 getPen1() {
			return pen1;
		}
		
		public String getBagprice1() {
			return bagprice1;
		}
		
		public static void main(String[] args) {
			
			
			Bag1 b=new Bag1();
			b.setBrandname1("American Touristor");
			b.setBagprice1("1000");
			b.setPen1(new Pen1());
			
			Pen1 p=new Pen1();
			p.setColorname1("Blue");
			p.setPenname1("Cello");
			p.setPenprice1(50);
			p.setPennip1(new PenNip());
			
			PenNip n=new PenNip();
			n.setNipprice1(20);
			n.setNiptype1("Broad");
			
			
			System.out.println(b.getBrandname1());
			System.out.println(b.getBagprice1());
			System.out.println(p.getPenname1());
			System.out.println(p.getColorname1());
			System.out.println(p.getPenprice1());
			System.out.println(n.getNiptype1());
			System.out.println(n.getNipprice1());
		}
		
		
		
		
		
		
		
	
}
