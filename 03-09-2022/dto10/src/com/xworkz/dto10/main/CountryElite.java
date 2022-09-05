package com.xworkz.dto10.main;

import com.xworkz.dto10.CountryDTO;

public class CountryElite {

	public static void main(String[] args) {
		
		CountryDTO country=new CountryDTO();
		country.getAncientIndia();
		country.setCountryName("India");
		System.out.println(country.getCountryName());
		country.setLocatedIn("Northern Hemisphere");
		System.out.println(country.getLocatedIn());
		country.getCapitalOfIndia();
		country.getLargrCityName();
		country.getPrimeMinisterName();
		country.getLokSabhaSpeakerName();
		
		CountryDTO country1=new CountryDTO();
		country1.getAncientIndia();
		country1.setCountryName("America");
		System.out.println(country1.getCountryName());
		country1.setLocatedIn("north america");
		System.out.println(country1.getLocatedIn());
		country1.getCapitalOfIndia();
		country1.getLargrCityName();
		country1.getPrimeMinisterName();
		country1.getLokSabhaSpeakerName();
		
		CountryDTO country2=new CountryDTO();
		country2.getAncientIndia();
		country2.setCountryName("Sri Lanka");
		System.out.println(country2.getCountryName());
		country2.setLocatedIn("South Asia");
		System.out.println(country2.getLocatedIn());
		country2.getCapitalOfIndia();
		country2.getLargrCityName();
		country2.getPrimeMinisterName();
		country2.getLokSabhaSpeakerName();
		
		CountryDTO country3=new CountryDTO();
		country3.getAncientIndia();
		country3.getCountryName();
		country3.getLocatedIn();
		country3.setCapitalOfIndia("Dheli");
		System.out.println(country3.getCapitalOfIndia());
		country3.setLargrCityName("Mubai");
		System.out.println(country3.getLargrCityName());
		country3.getPrimeMinisterName();
		country3.getLokSabhaSpeakerName();
		
		CountryDTO country4=new CountryDTO();
		country4.getAncientIndia();
		country4.getCountryName();
		country4.getLocatedIn();
		country4.getCapitalOfIndia();
		country4.getLargrCityName();
		country4.getPrimeMinisterName();
		country4.getLokSabhaSpeakerName();
		
		CountryDTO country5=new CountryDTO();
		country5.getAncientIndia();
		country5.getCountryName();
		country5.getLocatedIn();
		country5.getCapitalOfIndia();
		country5.getLargrCityName();
		country5.getPrimeMinisterName();
		country5.getLokSabhaSpeakerName();
		
		int code=country1.hashCode();
		System.out.println(code);
		
		if (country1.hashCode()==country.hashCode()) {
			country1.equals(country1);
			
		}
			if(country2.hashCode()==country.hashCode()) {
				country2.equals(country2);
					
		}
			if(country2.hashCode()==country2.hashCode())
				country3.equals(country3);
			
		else {
			System.out.println("it is not equals");
		}

	}

}
