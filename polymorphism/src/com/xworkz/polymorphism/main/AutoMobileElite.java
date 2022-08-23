package com.xworkz.polymorphism.main;

import com.xworkz.polymorphism.HondaAutomobile;
import com.xworkz.polymorphism.chaild.TataAutomobile;

public class AutoMobileElite {

	public static void main(String[] args) {
		
		System.out.println("HonadaAutomobile is inherited by Automobile");
		HondaAutomobile honda = new HondaAutomobile(09.00, 08.30);
		honda.setBrand("Hero");
		honda.setType("Two Wheeler");

		honda.torisu();
		System.out.println("TataAutomobile is inherited by Automobile");
		TataAutomobile tata = new TataAutomobile();
		tata.setBrand("Tata Motors");
		tata.setType("Four Wheeler");
		tata.torisu();

	}
		
	
   
   
	

}
