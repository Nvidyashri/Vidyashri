package com.xworkz.dto8;

public class MyHome {
	
	private String homeName;
	private String Place;
	private int constructionYear;
	private int constructionDate;
	private String constructionDay;
	private int homeLength;
	private int homewidth;
	private int noOfDoars;
	private int noOfRooms;
	private int noOfFans;
	private int noOfWindows;
	private int noOfChairs;
	private int noOfTable;
	private int noOfTv;
	private int noOfMembers;
	private int noOfDogs;
	private int noOfCats;
	private String nameOfTheHeadPerson;
	private long mobileNo;
	private int homeNumbers;
	private int noOfGates;
	private boolean garden;
	private boolean flowers;
	private String grandMaName;
	private String grandPaName;
	
	@Override
	public int hashCode() {
		return 50;
	}
	@Override
	public boolean equals(Object obj) {
		
		if (obj != null ) {
			System.out.println("it is not equal");
			if(obj instanceof MyHome) {
				System.out.println("it is a instanceof plant");
				MyHome converted=(MyHome) obj;//casting
				 if(converted.homeName.equals(this.homeName)&& converted.Place.equals(this.Place)) {
					  System.out.println("name and trainType are equal");
				
			}
				 else {
					 System.out.println("name and trainType are not equal");
				 }
		}
			else {
				System.out.println("both are equal");
			}
		}

		return super.equals(obj);
	}
	public String getHomeName() {
		return homeName;
	}
	public void setHomeName(String homeName) {
		this.homeName = homeName;
	}
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		Place = place;
	}
	public int getConstructionYear() {
		return constructionYear;
	}
	public void setConstructionYear(int constructionYear) {
		this.constructionYear = constructionYear;
	}
	public int getConstructionDate() {
		return constructionDate;
	}
	public void setConstructionDate(int constructionDate) {
		this.constructionDate = constructionDate;
	}
	public String getConstructionDay() {
		return constructionDay;
	}
	public void setConstructionDay(String constructionDay) {
		this.constructionDay = constructionDay;
	}
	public int getHomeLength() {
		return homeLength;
	}
	public void setHomeLength(int homeLength) {
		this.homeLength = homeLength;
	}
	public int getHomewidth() {
		return homewidth;
	}
	public void setHomewidth(int homewidth) {
		this.homewidth = homewidth;
	}
	public int getNoOfDoars() {
		return noOfDoars;
	}
	public void setNoOfDoars(int noOfDoars) {
		this.noOfDoars = noOfDoars;
	}
	public int getNoOfRooms() {
		return noOfRooms;
	}
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
	public int getNoOfFans() {
		return noOfFans;
	}
	public void setNoOfFans(int noOfFans) {
		this.noOfFans = noOfFans;
	}
	public int getNoOfWindows() {
		return noOfWindows;
	}
	public void setNoOfWindows(int noOfWindows) {
		this.noOfWindows = noOfWindows;
	}
	public int getNoOfChairs() {
		return noOfChairs;
	}
	public void setNoOfChairs(int noOfChairs) {
		this.noOfChairs = noOfChairs;
	}
	public int getNoOfTable() {
		return noOfTable;
	}
	public void setNoOfTable(int noOfTable) {
		this.noOfTable = noOfTable;
	}
	public int getNoOfTv() {
		return noOfTv;
	}
	public void setNoOfTv(int noOfTv) {
		this.noOfTv = noOfTv;
	}
	public int getNoOfMembers() {
		return noOfMembers;
	}
	public void setNoOfMembers(int noOfMembers) {
		this.noOfMembers = noOfMembers;
	}
	public int getNoOfDogs() {
		return noOfDogs;
	}
	public void setNoOfDogs(int noOfDogs) {
		this.noOfDogs = noOfDogs;
	}
	public int getNoOfCats() {
		return noOfCats;
	}
	public void setNoOfCats(int noOfCats) {
		this.noOfCats = noOfCats;
	}
	public String getNameOfTheHeadPerson() {
		return nameOfTheHeadPerson;
	}
	public void setNameOfTheHeadPerson(String nameOfTheHeadPerson) {
		this.nameOfTheHeadPerson = nameOfTheHeadPerson;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getHomeNumbers() {
		return homeNumbers;
	}
	public void setHomeNumbers(int homeNumbers) {
		this.homeNumbers = homeNumbers;
	}
	public int getNoOfGates() {
		return noOfGates;
	}
	public void setNoOfGates(int noOfGates) {
		this.noOfGates = noOfGates;
	}
	public boolean isGarden() {
		return garden;
	}
	public void setGarden(boolean garden) {
		this.garden = garden;
	}
	public boolean isFlowers() {
		return flowers;
	}
	public void setFlowers(boolean flowers) {
		this.flowers = flowers;
	}
	public String getGrandMaName() {
		return grandMaName;
	}
	public void setGrandMaName(String grandMaName) {
		this.grandMaName = grandMaName;
	}
	public String getGrandPaName() {
		return grandPaName;
	}
	public void setGrandPaName(String grandPaName) {
		this.grandPaName = grandPaName;
	}
	
	
	
	
	

}
