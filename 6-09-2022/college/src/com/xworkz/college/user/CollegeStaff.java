package com.xworkz.college.user;

import com.xworkz.college.rules.CollegeRules;

public class CollegeStaff {
	
	private CollegeRules collegeRules;
	
	public CollegeStaff(CollegeRules collegeRules) {
		this.collegeRules=collegeRules;
		
	}
	public void checkRules() {
		System.out.println("checking the rules");
		boolean dress=collegeRules.dressCode();
		double fees=collegeRules.anualFees();
		boolean allowed=collegeRules.UGcourse();
		if(dress && fees>50000 && allowed) {
			System.out.println("Rules are not followed");
			
		}
		else {
			System.out.println("Rules are Followed");
			
		}
		
	}
	public void maintanence() {
		System.out.println("maintaining the College");
	}
	

}
