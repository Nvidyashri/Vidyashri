package com.xwrkz.dto5;

public class CollegeDTO {
	
	private String collegeName;
	private String location;
	private String type;
	private int collegeFees;
	private int noOfClassRooms;
	private int noOfteachers;
	private String outterLook;
	private String innerLook;
	private String overLook;
	private boolean goodTeaching;
	private String specilities;
	private String academics;
	private String classAvailability;
	private String supportServices;
	private double noOfStudents;
	private int noOfNonTeachingStaf;
	private int classSizeCalculation;
	private String applyingWhatYouLearn;
	private boolean canteanAvailabelity;
	private String aluminiNetworks;
	private String collegeMission;
	private int noOfDepartments;
	private String website;
	private String collegeProfile;
	private String collegeData;
	private String diversity;
	
	@Override
	public int hashCode() {
		return 1000;
	}
	@Override
	public boolean equals(Object obj) {
		
		if (obj != null ) {
			System.out.println("it is not equal");
			if(obj instanceof CollegeDTO) {
				System.out.println("it is a instanceof College");
				CollegeDTO converted=(CollegeDTO) obj;//casting
				 if(converted.collegeName.equals(this.collegeName)&& converted.location.equals(this.location)) {
					  System.out.println("collegeName and location are equal");
				
			}
				 else {
					 System.out.println("collegeName and location are not equal");
				 }
		}
			else {
				System.out.println("both are equal");
			}
		}
		return super.equals(obj);
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCollegeFees() {
		return collegeFees;
	}
	public void setCollegeFees(int collegeFees) {
		this.collegeFees = collegeFees;
	}
	public int getNoOfClassRooms() {
		return noOfClassRooms;
	}
	public void setNoOfClassRooms(int noOfClassRooms) {
		this.noOfClassRooms = noOfClassRooms;
	}
	public int getNoOfteachers() {
		return noOfteachers;
	}
	public void setNoOfteachers(int noOfteachers) {
		this.noOfteachers = noOfteachers;
	}
	public String getOutterLook() {
		return outterLook;
	}
	public void setOutterLook(String outterLook) {
		this.outterLook = outterLook;
	}
	public String getInnerLook() {
		return innerLook;
	}
	public void setInnerLook(String innerLook) {
		this.innerLook = innerLook;
	}
	public String getOverLook() {
		return overLook;
	}
	public void setOverLook(String overLook) {
		this.overLook = overLook;
	}
	public boolean isGoodTeaching() {
		return goodTeaching;
	}
	public void setGoodTeaching(boolean goodTeaching) {
		this.goodTeaching = goodTeaching;
	}
	public String getSpecilities() {
		return specilities;
	}
	public void setSpecilities(String specilities) {
		this.specilities = specilities;
	}
	public String getAcademics() {
		return academics;
	}
	public void setAcademics(String academics) {
		this.academics = academics;
	}
	public String getClassAvailability() {
		return classAvailability;
	}
	public void setClassAvailability(String classAvailability) {
		this.classAvailability = classAvailability;
	}
	public String getSupportServices() {
		return supportServices;
	}
	public void setSupportServices(String supportServices) {
		this.supportServices = supportServices;
	}
	public double getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(double noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public int getNoOfNonTeachingStaf() {
		return noOfNonTeachingStaf;
	}
	public void setNoOfNonTeachingStaf(int noOfNonTeachingStaf) {
		this.noOfNonTeachingStaf = noOfNonTeachingStaf;
	}
	public int getClassSizeCalculation() {
		return classSizeCalculation;
	}
	public void setClassSizeCalculation(int classSizeCalculation) {
		this.classSizeCalculation = classSizeCalculation;
	}
	public String getApplyingWhatYouLearn() {
		return applyingWhatYouLearn;
	}
	public void setApplyingWhatYouLearn(String applyingWhatYouLearn) {
		this.applyingWhatYouLearn = applyingWhatYouLearn;
	}
	public boolean isCanteanAvailabelity() {
		return canteanAvailabelity;
	}
	public void setCanteanAvailabelity(boolean canteanAvailabelity) {
		this.canteanAvailabelity = canteanAvailabelity;
	}
	public String getAluminiNetworks() {
		return aluminiNetworks;
	}
	public void setAluminiNetworks(String aluminiNetworks) {
		this.aluminiNetworks = aluminiNetworks;
	}
	public String getCollegeMission() {
		return collegeMission;
	}
	public void setCollegeMission(String collegeMission) {
		this.collegeMission = collegeMission;
	}
	public int getNoOfDepartments() {
		return noOfDepartments;
	}
	public void setNoOfDepartments(int noOfDepartments) {
		this.noOfDepartments = noOfDepartments;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getCollegeProfile() {
		return collegeProfile;
	}
	public void setCollegeProfile(String collegeProfile) {
		this.collegeProfile = collegeProfile;
	}
	public String getCollegeData() {
		return collegeData;
	}
	public void setCollegeData(String collegeData) {
		this.collegeData = collegeData;
	}
	public String getDiversity() {
		return diversity;
	}
	public void setDiversity(String diversity) {
		this.diversity = diversity;
	}
	
	
	
	
	

}
