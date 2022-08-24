package com.xworkz.overridingextend.main;

import com.xworkz.overridingextend.HondaAutoMobil;
import com.xworkz.overridingextend.chaild.TataAutoMobile;

public class AutomobileElite {

	public static void main(String[] args) {
		
		System.out.println("HonadaAutomobile is inherited by Automobile");
		HondaAutoMobil honda = new HondaAutoMobil(09.00, 08.30);
		honda.setBrand("Hero");
		honda.setType("Two Wheeler");

		honda.torisu();
		System.out.println("TataAutomobile is inherited by Automobile");
		TataAutoMobile tata = new TataAutoMobile();
		tata.setBrand("Tata Motors");
		tata.setType("Four Wheeler");
		tata.torisu();
		
		
	}

}
