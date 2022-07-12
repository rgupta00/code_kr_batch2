package com.d.enum_ex;

//S(38), M(40), L(42), XL(44), XXL(46);


enum ShirtSize {
	S(38), M(40), L(42), XL(44), XXL(46);
	int size;
	private ShirtSize(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}

	
}

class Shirt {
	private String color;
	private ShirtSize size;
	private double price;

	public Shirt() {
	}

	public Shirt(String color, ShirtSize size, double price) {
		this.color = color;
		this.size = size;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ShirtSize getSize() {
		return size;
	}

	public void setSize(ShirtSize size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Shirt [color=").append(color).append(", size=").append(size).append(", price=").append(price)
				.append("]");
		return builder.toString();
	}

}

public class A_NeedOfEnum_Ex {
	public static void main(String[] args) {

			//how to convert a string to enum valueOf
		String s="M";
		
		ShirtSize shirtSize=ShirtSize.valueOf(s);
		
		//doing revserse
		
		String s2=shirtSize.toString();
		
		
		//how to print all enums const
//		ShirtSize[] values = ShirtSize.values();
//		for(ShirtSize e: values) {
//			System.out.println(e.getSize()+" : "+ e.ordinal()+": "+e.toString());
//		}
		
//		Shirt shirt = new Shirt("red", ShirtSize.M, 1500.00);
//		System.out.println(shirt);
	}
}
