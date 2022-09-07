package com.xworkz.college.main;

import com.xworkz.college.follower.StudentsRules;
import com.xworkz.college.rules.CollegeRules;
import com.xworkz.college.user.CollegeStaff;

public class CollegeElite {

	public static void main(String[] args) {
 
		CollegeRules collegeRules=new StudentsRules();
		
		CollegeStaff collegeStaff=new CollegeStaff(collegeRules);
		collegeStaff.checkRules();
		collegeStaff.maintanence();
		
	}

}
