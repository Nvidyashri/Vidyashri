package com.xworkz.inheritence.Train;

public class Train {

	public String name;
	public String stationName;
	public int noOfPlatform;
	public int noOfStops;
	public boolean reservations;
	
	public void torisu() {
		
		System.out.println(this.name);
		System.out.println(this.stationName);
		System.out.println(this.noOfPlatform);
		System.out.println(this.noOfStops);
		System.out.println(this.reservations);
		
	}
}
