package com.xworkz.inheritencePrograms.cricket;

public class Cricket {
	
	String country;
	String captain;
	String gender;
	
	String setCountry(String Country) {
		this.country=country;
		return country;
	}
	
	String setCaptain(String captain) {
		this.captain=captain;
		return captain;
		
	}
	String setGender(String gender) {
		this.gender=gender;
		return gender;
		
	}
	public boolean entertainment() {
		System.out.println("played well");
		return true;
		
	}
	double presentation(double price) {
		System.out.println("got price of"+price);
		return price;
		
	}
   void torisu() {
	   System.out.println("country="+this.country);
	   System.out.println("captain="+this.captain);
	   System.out.println("gender="+this.gender);
	
}
}
