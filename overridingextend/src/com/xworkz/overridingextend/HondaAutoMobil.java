package com.xworkz.overridingextend;

public class HondaAutoMobil extends Automobile {
	
	double openTime;
	double closeTime;

	public HondaAutoMobil(double openTime, double closeTime) {
		this.openTime = openTime;
		this.closeTime = closeTime;
	}

	@Override
	public void torisu() {
		super.torisu();
		System.out.println(this.openTime);
		System.out.println(this.closeTime);
	}
	


}
