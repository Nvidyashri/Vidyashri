package com.xworkz.dto8.main;

import com.xworkz.dto8.MyHome;

public class MyHomeElite {

	public static void main(String[] args) {
		
		MyHome home=new MyHome();
		home.getConstructionDate();
		home.getConstructionDay();
		home.getConstructionYear();
		home.getGrandMaName();
		home.getGrandPaName();
		home.getHomeLength();
		home.setHomeName("Aashirvada Nilaya");
		System.out.println(home.getHomeName());
		home.getHomeNumbers();
		home.getHomewidth();
		home.getMobileNo();
		home.getNameOfTheHeadPerson();
		home.getNoOfCats();
		home.getNoOfChairs();
		home.getNoOfDoars();
		home.getNoOfDogs();
		home.getNoOfFans();
		home.getNoOfGates();
		home.getNoOfMembers();
		home.getNoOfRooms();
		home.setPlace("Hubballi");
		System.out.println(home.getPlace());
		
		MyHome home1=new MyHome();
		home1.getConstructionDate();
		home1.getConstructionDay();
		home1.getConstructionYear();
		home1.getGrandMaName();
		home1.getGrandPaName();
		home1.getHomeLength();
		home1.setHomeName("Aashirvada Nilaya");
		System.out.println(home1.getHomeName());
		home1.getHomeNumbers();
		home1.getHomewidth();
		home1.getMobileNo();
		home1.getNameOfTheHeadPerson();
		home1.getNoOfCats();
		home1.getNoOfChairs();
		home1.getNoOfDoars();
		home1.getNoOfDogs();
		home1.getNoOfFans();
		home1.getNoOfGates();
		home1.getNoOfMembers();
		home1.getNoOfRooms();
		home1.setPlace("Hubballi");
		System.out.println(home1.getPlace());
		
		int code=home1.hashCode();
		System.out.println(code);
		
		if (home1.hashCode()==home.hashCode()) {
			home.equals(home1);
				
		}
		else {
			System.out.println("it is not equals");
		}


	}

}
