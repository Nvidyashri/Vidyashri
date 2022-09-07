package com.xworkz.college.follower;

import com.xworkz.college.rules.CollegeRules;

public class StudentsRules implements CollegeRules {
	
	@Override
	public boolean dressCode() {
		System.out.println("dressCode followed bye Students");
		return true;
	}
	
	@Override
	public double anualFees() { 
		System.out.println("Running AnualFees");
		return 50000;
	}
	
	@Override
	public boolean UGcourse() {
		System.out.println("Running UG course");
		return true;
	}
	
	

}
