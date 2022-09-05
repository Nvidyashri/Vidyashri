package com.xworkz.dto;
import com.xworkz.dto.OnlineMarketDTO;
public class OnlineMarketElite {

	public static void main(String[] args) {

		OnlineMarketDTO online1 = new OnlineMarketDTO();
		online1.setCoFounderName("Nandan Reddy");
		online1.setSince(2014);
		online1.setLocation("Mumbai");
		online1.setType("Online Sale");
		online1.setName("Delevery Partner");
		online1.setBrandName("Swiggy");
		online1.setMode("Online");
		online1.setCategory("Veg and NonVEG");
		online1.setCakeName("Chocolate cake");
		online1.setCakeType("Normal cake");
		online1.setCompany("Just cake");
		online1.setPrice(500);
		online1.setChocolateName("5Star");
		online1.setCompany1("Nestle");
		online1.setPrice1(10);
		online1.setChipsName("Potato");
		online1.setCompany2("Lays");
		online1.setPrice2(5);
		online1.setTeaPowderName("Tata tea");
		online1.setCompany3("TATA");
		online1.setPrice3(38);
		online1.setCofeeName("filter");
		online1.setCompany4("Nescafe");
		online1.setPrice4(60);
		online1.setBiscuitName("Parle");
		online1.setCompany5("Parle G");
		online1.setPrice5(5);
		online1.setCreamBiscuitName("Oreo");
		online1.setCompany6("Nestle");
		online1.setPrice6(10);
		online1.setChocoBiscuitName("Twenty Twenty");
		online1.setCompany7("Britania");
		online1.setDeodrantName("Nivea Men");
		online1.setDeodrantType("Body odour");
		online1.setDeodrantFlavour("smoth");
		online1.setCompany8("Nivea");
		online1.setPrice8(225.0);
		online1.setSoapType("face wash");
		online1.setSoapBrand(250.0);
		online1.setSoapFlavour("flower");
		online1.setSoapColor("green");
		online1.setPrice9(23.0);
		online1.setFeedBack("Properties adding is deficult ");
		int fog = online1.hashCode();
		System.out.println(fog);

		OnlineMarketDTO online = new OnlineMarketDTO();
		System.out.println(online.hashCode());
		online.setCoFounderName("");
		online.setSince(null);
		online.setLocation("");
		online.setType("");
		online.setName("");
		online.setBrandName("");
		online.setMode("");
		online.setCategory("");
		online.setCakeName("Oreo");
		online.setCakeType("");
		online.setCompany("");
		online.setPrice(null);
		online.setChocolateName("");
		online.setCompany1("");
		online.setPrice1(null);
		online.setChipsName("");
		online.setCompany2("");
		online.setPrice2(null);
		online.setTeaPowderName("");
		online.setCompany3("");
		online.setPrice3(null);
		online.setCofeeName("");
		online.setCompany4("");
		online.setPrice4(null);
		online.setBiscuitName("Parle");
		online.setCompany5("");
		online.setPrice5(null);
		online.setCreamBiscuitName("");
		online.setCompany6("");
		online.setPrice6(null);
		online.setChocoBiscuitName("");
		online.setCompany7(null);
		online.setDeodrantName("");
		online.setDeodrantType("");
		online.setDeodrantFlavour("");
		online.setCompany8("");
		online.setPrice8(null);
		online.setSoapType("");
		online.setSoapBrand(null);
		online.setSoapFlavour("");
		online.setSoapColor("");
		online.setPrice9(null);
		online.setFeedBack("");

		online.equals(online1);

	

	}

}
