package com.xworkz.inheritencePrograms.cricket;

public class T20Cricket extends Cricket {
	
	String manOftheMtach(String manOfMtach) {

		return manOfMtach;
	}

	@Override
	public boolean entertainment() {
		System.out.println("played well");
		return true;
	}

	@Override
	void torisu() {
		super.torisu();
		System.out.println(entertainment());
	}

}
