package com.xworkz.dto10;

public class CountryDTO {
	
	private String countryName;         //India
	private String locatedIn;           //Northern Hemisphere
	private int noOfNeighboursCountry; //7
	private boolean mostPopulousDemocracy;
	private boolean secondMostPopulousContry;
	private String capitalOfIndia;    
	private String largrCityName;   
	private String officialLanguages; 
	private int noOfNativeLanguages;   //447
	private int noOfReligions;         //8
	private String government;        
	private String presientName;     
	private String voicePresidentName; 
	private String primeMinisterName;      
	private String chiefJusticeName;     
	private String lokSabhaSpeakerName; 
	private String legislature;
	private String upperHouse;
	private String lowerHouse;
	private int independenceDay;
	private int independenceYear;
	private String independenceMonth;
	private double totalAreaOfIndia;
	private double totalWater;
	private int republicDay;
	private String republicMonth;
	private int republicYear;
	private long totalPopulation;
	private String currency;
	private String timeZone;
	private String dateFormate;
	private String drivingSide;
	private int callingCode;
	private int iosCode;
	private String internetTld;
	private String etymology;
	private String history;
	private String ancientIndia;
	private String medievalIndia;
	private String modernIndia;
	private String geography;
	private String biodiversity;
	private String politics;
	private String economy;
	private String culture;
	private String demographics;
	private String bibilography;
	
	
	@Override
	public int hashCode() {
		return 600;
	}
	@Override
	public boolean equals(Object obj) {
		

		if (obj != null ) {
			System.out.println("it is not equal");
			if(obj instanceof CountryDTO) {
				System.out.println("it is a instanceof Country");
				CountryDTO converted=(CountryDTO) obj;//casting
				 if(converted.countryName.equals(this.countryName)&& converted.locatedIn.equals(this.locatedIn)) {
					  System.out.println("countryName and locatedIn are equal");
				
			}
				 else {
					 System.out.println("countryName and locatedIn are not equal");
				 }
		}
			else {
				System.out.println("both are equal");
			}
		}
		return super.equals(obj);
		
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getLocatedIn() {
		return locatedIn;
	}
	public void setLocatedIn(String locatedIn) {
		this.locatedIn = locatedIn;
	}
	public int getNoOfNeighboursCountry() {
		return noOfNeighboursCountry;
	}
	public void setNoOfNeighboursCountry(int noOfNeighboursCountry) {
		this.noOfNeighboursCountry = noOfNeighboursCountry;
	}
	public boolean isMostPopulousDemocracy() {
		return mostPopulousDemocracy;
	}
	public void setMostPopulousDemocracy(boolean mostPopulousDemocracy) {
		this.mostPopulousDemocracy = mostPopulousDemocracy;
	}
	public boolean isSecondMostPopulousContry() {
		return secondMostPopulousContry;
	}
	public void setSecondMostPopulousContry(boolean secondMostPopulousContry) {
		this.secondMostPopulousContry = secondMostPopulousContry;
	}
	public String getCapitalOfIndia() {
		return capitalOfIndia;
	}
	public void setCapitalOfIndia(String capitalOfIndia) {
		this.capitalOfIndia = capitalOfIndia;
	}
	public String getLargrCityName() {
		return largrCityName;
	}
	public void setLargrCityName(String largrCityName) {
		this.largrCityName = largrCityName;
	}
	public String getOfficialLanguages() {
		return officialLanguages;
	}
	public void setOfficialLanguages(String officialLanguages) {
		this.officialLanguages = officialLanguages;
	}
	public int getNoOfNativeLanguages() {
		return noOfNativeLanguages;
	}
	public void setNoOfNativeLanguages(int noOfNativeLanguages) {
		this.noOfNativeLanguages = noOfNativeLanguages;
	}
	public int getNoOfReligions() {
		return noOfReligions;
	}
	public void setNoOfReligions(int noOfReligions) {
		this.noOfReligions = noOfReligions;
	}
	public String getGovernment() {
		return government;
	}
	public void setGovernment(String government) {
		this.government = government;
	}
	public String getPresientName() {
		return presientName;
	}
	public void setPresientName(String presientName) {
		this.presientName = presientName;
	}
	public String getVoicePresidentName() {
		return voicePresidentName;
	}
	public void setVoicePresidentName(String voicePresidentName) {
		this.voicePresidentName = voicePresidentName;
	}
	public String getPrimeMinisterName() {
		return primeMinisterName;
	}
	public void setPrimeMinisterName(String primeMinisterName) {
		this.primeMinisterName = primeMinisterName;
	}
	public String getChiefJusticeName() {
		return chiefJusticeName;
	}
	public void setChiefJusticeName(String chiefJusticeName) {
		this.chiefJusticeName = chiefJusticeName;
	}
	public String getLokSabhaSpeakerName() {
		return lokSabhaSpeakerName;
	}
	public void setLokSabhaSpeakerName(String lokSabhaSpeakerName) {
		this.lokSabhaSpeakerName = lokSabhaSpeakerName;
	}
	public String getLegislature() {
		return legislature;
	}
	public void setLegislature(String legislature) {
		this.legislature = legislature;
	}
	public String getUpperHouse() {
		return upperHouse;
	}
	public void setUpperHouse(String upperHouse) {
		this.upperHouse = upperHouse;
	}
	public String getLowerHouse() {
		return lowerHouse;
	}
	public void setLowerHouse(String lowerHouse) {
		this.lowerHouse = lowerHouse;
	}
	public int getIndependenceDay() {
		return independenceDay;
	}
	public void setIndependenceDay(int independenceDay) {
		this.independenceDay = independenceDay;
	}
	public int getIndependenceYear() {
		return independenceYear;
	}
	public void setIndependenceYear(int independenceYear) {
		this.independenceYear = independenceYear;
	}
	public String getIndependenceMonth() {
		return independenceMonth;
	}
	public void setIndependenceMonth(String independenceMonth) {
		this.independenceMonth = independenceMonth;
	}
	public double getTotalAreaOfIndia() {
		return totalAreaOfIndia;
	}
	public void setTotalAreaOfIndia(double totalAreaOfIndia) {
		this.totalAreaOfIndia = totalAreaOfIndia;
	}
	public double getTotalWater() {
		return totalWater;
	}
	public void setTotalWater(double totalWater) {
		this.totalWater = totalWater;
	}
	public int getRepublicDay() {
		return republicDay;
	}
	public void setRepublicDay(int republicDay) {
		this.republicDay = republicDay;
	}
	public String getRepublicMonth() {
		return republicMonth;
	}
	public void setRepublicMonth(String republicMonth) {
		this.republicMonth = republicMonth;
	}
	public int getRepublicYear() {
		return republicYear;
	}
	public void setRepublicYear(int republicYear) {
		this.republicYear = republicYear;
	}
	public long getTotalPopulation() {
		return totalPopulation;
	}
	public void setTotalPopulation(long totalPopulation) {
		this.totalPopulation = totalPopulation;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public String getDateFormate() {
		return dateFormate;
	}
	public void setDateFormate(String dateFormate) {
		this.dateFormate = dateFormate;
	}
	public String getDrivingSide() {
		return drivingSide;
	}
	public void setDrivingSide(String drivingSide) {
		this.drivingSide = drivingSide;
	}
	public int getCallingCode() {
		return callingCode;
	}
	public void setCallingCode(int callingCode) {
		this.callingCode = callingCode;
	}
	public int getIosCode() {
		return iosCode;
	}
	public void setIosCode(int iosCode) {
		this.iosCode = iosCode;
	}
	public String getInternetTld() {
		return internetTld;
	}
	public void setInternetTld(String internetTld) {
		this.internetTld = internetTld;
	}
	public String getEtymology() {
		return etymology;
	}
	public void setEtymology(String etymology) {
		this.etymology = etymology;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public String getAncientIndia() {
		return ancientIndia;
	}
	public void setAncientIndia(String ancientIndia) {
		this.ancientIndia = ancientIndia;
	}
	public String getMedievalIndia() {
		return medievalIndia;
	}
	public void setMedievalIndia(String medievalIndia) {
		this.medievalIndia = medievalIndia;
	}
	public String getModernIndia() {
		return modernIndia;
	}
	public void setModernIndia(String modernIndia) {
		this.modernIndia = modernIndia;
	}
	public String getGeography() {
		return geography;
	}
	public void setGeography(String geography) {
		this.geography = geography;
	}
	public String getBiodiversity() {
		return biodiversity;
	}
	public void setBiodiversity(String biodiversity) {
		this.biodiversity = biodiversity;
	}
	public String getPolitics() {
		return politics;
	}
	public void setPolitics(String politics) {
		this.politics = politics;
	}
	public String getEconomy() {
		return economy;
	}
	public void setEconomy(String economy) {
		this.economy = economy;
	}
	public String getCulture() {
		return culture;
	}
	public void setCulture(String culture) {
		this.culture = culture;
	}
	public String getDemographics() {
		return demographics;
	}
	public void setDemographics(String demographics) {
		this.demographics = demographics;
	}
	public String getBibilography() {
		return bibilography;
	}
	public void setBibilography(String bibilography) {
		this.bibilography = bibilography;
	}
	
	
	

}
