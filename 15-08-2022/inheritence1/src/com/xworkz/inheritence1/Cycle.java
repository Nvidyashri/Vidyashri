package com.xworkz.inheritence1;

public class Cycle {
	
	public String name="Hero Honda";
	public String company="Splendor";
	public int noOfWheels=2;
	public int noOfSeats=2;
	public int price=88041;
	
	public Cycle() {
		
		System.out.println("Constructore of Cycle");
	}
	
	public void torisu() {
		
		System.out.println(this.name);
		System.out.println(this.company);
		System.out.println(this.noOfWheels);
		System.out.println(this.noOfSeats);
		System.out.println(this.price);
	}

	

}
