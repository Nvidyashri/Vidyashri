package com.xworkz.dto.main;

import com.xworkz.dto.SuperMarketDTO;

public class SuperMarketElite {

	public static void main(String[] args) {

		SuperMarketDTO market = new SuperMarketDTO();
		market.setName("Spencers");
		market.setRatings(5.0);
		market.setLocation("Gokul Road");
		market.setCity("Hubballi");
		market.setState("Karnataka");
		market.setPin(500007);
		SuperMarketDTO market2 = new SuperMarketDTO();
		market2.setName("Spencers");
		market2.setRatings(3.0);
		market2.setLocation("Gokul Road");
		market2.setCity("Hubballi");
		market2.setState("Karnataka");
		market2.setPin(500007);
		if (market.hashCode() == market2.hashCode()) {
			System.out.println("same address");
			market.equals(market2);
		} else {
			System.err.println("diff address");
		}
	}

}
