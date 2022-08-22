package com.xworkz.inheritencePrograms.cricket;

public class TestCricket  extends Cricket {
	
	String groundType;
	String setGroundType(String groundType ) {
		this.groundType=groundType;
		return groundType;
	}
	@Override
	double presentation(double price) {
		System.out.println("got price of "+price);
		return price;
	}
	@Override
	void torisu() {
		super.torisu();
		System.out.println("ground type is "+groundType);

	}

}
