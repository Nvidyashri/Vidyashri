package com.xwrkz.dto5.main;

import com.xwrkz.dto5.CollegeDTO;

public class CollegeElite {

	public static void main(String[] args) {
		CollegeDTO college=new CollegeDTO();
		college.getAcademics();
		college.getAluminiNetworks();
		college.getApplyingWhatYouLearn();
		college.getClassAvailability();
		college.getClassSizeCalculation();
		college.getCollegeData();
		college.getCollegeFees();
		college.getCollegeMission();
		college.setCollegeName("Agadi Engineering College");
		System.out.println(college.getCollegeName());
		college.getCollegeProfile();
		college.getDiversity();
		college.getInnerLook();
		college.setLocation("laxmeshwar");
		System.out.println(college.getLocation());
		college.getNoOfClassRooms();
		college.getNoOfDepartments();
		college.getNoOfNonTeachingStaf();
		college.getNoOfStudents();
		college.getOutterLook();
		college.getNoOfteachers();
		college.getOverLook();
		college.getSpecilities();
		college.getSupportServices();
		college.getType();
		college.getWebsite();
		
		CollegeDTO college1=new CollegeDTO();
		college1.getAcademics();
		college1.getAluminiNetworks();
		college1.getApplyingWhatYouLearn();
		college1.getClassAvailability();
		college1.getClassSizeCalculation();
		college1.getCollegeData();
		college1.getCollegeFees();
		college1.getCollegeMission();
		college1.setCollegeName("HSK Science Institute");
		System.out.println(college.getCollegeName());
		college1.getCollegeProfile();
		college1.getDiversity();
		college1.getInnerLook();
		college1.setLocation("Hubballi");
		System.out.println(college1.getLocation());
		college1.getNoOfClassRooms();
		college1.getNoOfDepartments();
		college1.getNoOfNonTeachingStaf();
		college1.getNoOfStudents();
		college1.getOutterLook();
		college1.getNoOfteachers();
		college1.getOverLook();
		college1.getSpecilities();
		college1.getSupportServices();
		college1.getType();
		college1.getWebsite();
		
		int code=college1.hashCode();
		System.out.println(code);
		
		if (college1.hashCode()==college.hashCode()) {
			college1.equals(college1);
				
		}
		else {
			System.out.println("it is not equals");
		}
		

	}

}
