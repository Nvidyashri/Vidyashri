package com.xworkz.classtask.user;

import com.xworkz.classtask.rules.GymRules;

public class GymStaff {
	
	private GymRules gymRules;
	
	public GymStaff(GymRules gymRules) {
		this.gymRules=gymRules;
		
	}
	public void checkRules() {
		System.out.println("checking the rules");
		boolean shoes=gymRules.wareShoes();
		double fees=gymRules.monthlyFees();
		boolean allowed=gymRules.unisex();
		if(shoes && fees>200 && allowed) {
			System.out.println("Rules are followed");
			
		}
		else {
			System.out.println("Rules are not followed");
			
		}
		
	}
	public void maintanence() {
		System.out.println("maintaining the gym");
	}

}
