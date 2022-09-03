package com.xworkz.dto2;

public class VidyaDTO {
	
	private String name;
	private String serName;
	private String fatherName;
	private String motherName;
	private String place;
	private int birthYear;
	private String birthMonth;
	private String birthday;
	private int birthDate;
	private double height;
	private String hairType;
	private String favFood;
	private String favPlace;
	private String favIceCreem;
	private String favColour;
	private String favMovie;
	private String favSong;
	private boolean speaksKannada;
	private boolean speaksMarathi;
	private boolean speaksEnglish;
	private boolean speaksHindi;
	private String favAnimal;
	private String favBird;
	private String favGame;
	private String favActor;
	private String familyMembers;
	private String schoolName;
	private String collageName;
	
	
	@Override
	public int hashCode() {
		return 2022;
	}
	@Override
	public boolean equals(Object obj) {
		
		if (obj != null ) {
			System.out.println("it is not equal");
			if(obj instanceof VidyaDTO) {
				System.out.println("it is a instanceof plant");
				VidyaDTO converted=(VidyaDTO) obj;//casting
				 if(converted.name.equals(this.name)&& converted.place.equals(this.place)) {
					  System.out.println("name and place are equal");
				
			}
				 else {
					 System.out.println("name and place are not equal");
				 }
		}
			else {
				System.out.println("both are equal");
			}
		}
		return super.equals(obj);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSerName() {
		return serName;
	}
	public void setSerName(String serName) {
		this.serName = serName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getHairType() {
		return hairType;
	}
	public void setHairType(String hairType) {
		this.hairType = hairType;
	}
	public String getFavFood() {
		return favFood;
	}
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	public String getFavPlace() {
		return favPlace;
	}
	public void setFavPlace(String favPlace) {
		this.favPlace = favPlace;
	}
	public String getFavIceCreem() {
		return favIceCreem;
	}
	public void setFavIceCreem(String favIceCreem) {
		this.favIceCreem = favIceCreem;
	}
	public String getFavColour() {
		return favColour;
	}
	public void setFavColour(String favColour) {
		this.favColour = favColour;
	}
	public String getFavMovie() {
		return favMovie;
	}
	public void setFavMovie(String favMovie) {
		this.favMovie = favMovie;
	}
	public String getFavSong() {
		return favSong;
	}
	public void setFavSong(String favSong) {
		this.favSong = favSong;
	}
	public boolean isSpeaksKannada() {
		return speaksKannada;
	}
	public void setSpeaksKannada(boolean speaksKannada) {
		this.speaksKannada = speaksKannada;
	}
	public boolean isSpeaksMarathi() {
		return speaksMarathi;
	}
	public void setSpeaksMarathi(boolean speaksMarathi) {
		this.speaksMarathi = speaksMarathi;
	}
	public boolean isSpeaksEnglish() {
		return speaksEnglish;
	}
	public void setSpeaksEnglish(boolean speaksEnglish) {
		this.speaksEnglish = speaksEnglish;
	}
	public boolean isSpeaksHindi() {
		return speaksHindi;
	}
	public void setSpeaksHindi(boolean speaksHindi) {
		this.speaksHindi = speaksHindi;
	}
	public String getFavAnimal() {
		return favAnimal;
	}
	public void setFavAnimal(String favAnimal) {
		this.favAnimal = favAnimal;
	}
	public String getFavBird() {
		return favBird;
	}
	public void setFavBird(String favBird) {
		this.favBird = favBird;
	}
	public String getFavGame() {
		return favGame;
	}
	public void setFavGame(String favGame) {
		this.favGame = favGame;
	}
	public String getFavActor() {
		return favActor;
	}
	public void setFavActor(String favActor) {
		this.favActor = favActor;
	}
	public String getFamilyMembers() {
		return familyMembers;
	}
	public void setFamilyMembers(String familyMembers) {
		this.familyMembers = familyMembers;
	}
	
	
	
	
	

}
