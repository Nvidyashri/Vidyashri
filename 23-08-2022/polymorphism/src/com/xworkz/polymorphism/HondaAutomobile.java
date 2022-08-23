package com.xworkz.polymorphism;


public class HondaAutomobile extends Automobile
{
	
	public double openTime;
	public double closeTime;
	
	public void torisu() {
	    super.torisu();
		System.out.println(this.openTime);
		System.out.println(this.closeTime);
		
	}

}
