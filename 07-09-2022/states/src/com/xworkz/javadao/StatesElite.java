package com.xworkz.javadao;

import com.xworkz.implementr.StateDAOImplementr;

public class StatesElite {

	public static void main(String[] args) {
		
		StateDAOImplementr implementr=new StateDAOImplementr();
		implementr.save("Dharwad");
		implementr.save("Bagalkot");
		implementr.save("Bidar");
		implementr.save("Belagavi");
		implementr.save("Bengalore");
		implementr.save("Gadag");
		implementr.save("Haveri");
		implementr.save("Davangere");
		implementr.save("Hassan");
		implementr.save("Dakshin Kannada");
		implementr.save("Uttar Kannada");
		implementr.save("Tumakuru");
		implementr.save("vijayapura");
		implementr.save("Yadgi");
		implementr.save("Mysore");
		implementr.save("Kodagu");
		implementr.save("Kolar");
		implementr.save("Raichur");
		implementr.save("Koppal");
		implementr.save("Mandya");
		
		implementr.printlnAllStates();
		
		

	}

}
