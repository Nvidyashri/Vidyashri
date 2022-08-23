package com.xworkz.polymorphism.main;

import com.xworkz.polymorphism.HondaAutomobile;
import com.xworkz.polymorphism.chaild.TataAutomobile;

public class AutomobileElite {

	public static void main(String[] args) {
		
		System.out.println("HondaAutomobiles is in herited by Automobile");
		HondaAutomobile honda = new HondaAutomobile();
		honda.closeTime=9.00;
		honda.openTime=8.00;
		
		honda.setBrand("Hero");
		honda.setType("two wheeler");
		
		honda.torisu();
		System.out.println("TataAutomobile is inherited by Automobile");
		TataAutomobile tata = new TataAutomobile();
		tata.setBrand("Tata Motors");
		tata.setType("four wheeler");
		tata.torisu();
		
		
		
		

	}

}
