package com.xworkz.inheritencePrograms.cricket;

public class CricketElite {

	public static void main(String[] args) {
		
		Cricket cricket = new Cricket();
		System.out.println("<========================>");
		cricket.setCountry("India");
		cricket.setCaptain("Rohit Sharma");
		cricket.setGender("male");
		cricket.entertainment();
		cricket.presentation(66663.5);
		cricket.torisu();
		
		TestCricket testCricket=new TestCricket();
		System.out.println("<========================>");
		testCricket.setCountry("India");
		testCricket.setCaptain("Rohit Sharma");
		testCricket.setGender("male");
		testCricket.entertainment();
		testCricket.presentation(8976542.2);
		testCricket.setGroundType("muddy");
		testCricket.torisu();
		
		System.out.println("<========================>");
		T20Cricket t20Cricket= new T20Cricket();
		t20Cricket.setCountry("India");
		t20Cricket.setCaptain("Rohit Sharma");
		t20Cricket.setGender("male");
		t20Cricket.manOftheMtach("kohli");
		t20Cricket.torisu();

	}

		

	

}
