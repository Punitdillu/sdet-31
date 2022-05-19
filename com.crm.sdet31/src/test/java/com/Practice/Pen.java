package com.Practice;

public class Pen {
	
	private String  colour;
	private String  brand;
	private int  price ;
	
	 Pen(String colour,String brand,int price )
	{
		this.colour=colour;
		this.brand=brand;
		this.price=price;
	}

		public  void write() {
			
			System.out.println(colour);
		}
}

