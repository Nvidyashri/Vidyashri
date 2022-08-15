package com.xworkz.inheritence3;

public class Plane {
	
	public String name = "Turboprop Aircraft";
	public int noOfSeats = 19;
	public int price = 9000000;
	public boolean gun = true;
	public int noOfWings = 2;
	
	public Plane() {
		System.out.println("Constructor of Plane");
	}

	public void torisu() {
		
		System.out.println(this.name);
		System.out.println(this.noOfSeats);
		System.out.println(this.price);
		System.out.println(this.gun);
		System.out.println(this.noOfWings);
		
	}
}
