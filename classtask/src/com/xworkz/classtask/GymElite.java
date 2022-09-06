package com.xworkz.classtask;

import com.xworkz.classtask.follower.VidyashriGymRules;
import com.xworkz.classtask.rules.GymRules;
import com.xworkz.classtask.user.GymStaff;

public class GymElite {

	public static void main(String[] args) {
		
		GymRules gymRules=new VidyashriGymRules();
		
		GymStaff gymStaff = new GymStaff(gymRules);
		gymStaff.checkRules();
		gymStaff.maintanence();

	}

}
