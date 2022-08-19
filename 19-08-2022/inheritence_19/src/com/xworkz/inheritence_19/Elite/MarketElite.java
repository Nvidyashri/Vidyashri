package com.xworkz.inheritence_19.Elite;

import com.xworkz.inheritence_19.sub.SuperMarket;
import com.xworkz.inheritence_19.sup.Market;
import com.xworkz.inheritence_19.market.OnlineSuperMarket;

public class MarketElite {

	public static void main(String[] args) {
		
		
		Market market = new Market("Vegie Market", 6.30, 20.30);
		market.display();
		

		Market market2 = new SuperMarket("super market", 9.30, 23.30, "relaience fresh", "BTM", 20);
		market2.display();
		
		SuperMarket superMarket = new SuperMarket("SUPER MARKET", 8.30, 21.30, "Maitry", "BTM", 50);
		superMarket.display();

		Market market3 = new OnlineSuperMarket("Super Market", 7.30, 23.30, "MORE", "BTM", 90, "Dunzo", "Metro Cities",
				20);
		market3.display();
		
		SuperMarket superMarket2 = new OnlineSuperMarket("SUPER MARKET", 10.30, 22.30, "DMART", "MARHATHALLI", 50,
				"BLINK IT", "METRO CITIES", 15);
		superMarket2.display();
		
		
		
		
		if (market2 instanceof SuperMarket) {
			SuperMarket convo = (SuperMarket)market2;
			convo.typeOfMarket = "Stock";
			convo.display();
		}
		else {
			System.out.println("notv ref of Supermarket.");
		}
		
		
		if(superMarket2 instanceof OnlineSuperMarket) {
			OnlineSuperMarket convo = (OnlineSuperMarket)superMarket2;
			convo.location = "Bommanahalli";
			convo.display();
		}
		else {
			System.out.println("not a ref of OnlineSuperMarket");
		}
		
		
		if(market3 instanceof OnlineSuperMarket) {
			OnlineSuperMarket convo = (OnlineSuperMarket)market3;
			convo.onlineSMName = "JIO Mart";
			convo.display();
		}
		else {
			System.out.println("not aref of OnlineSuperMarket");
		}
	}

}
