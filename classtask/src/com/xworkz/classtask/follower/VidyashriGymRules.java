package com.xworkz.classtask.follower;

import com.xworkz.classtask.rules.GymRules;

public class VidyashriGymRules implements GymRules {
	
	@Override
	public boolean wareShoes() {
		System.out.println("running wareShoes");
		return true;
	}
	@Override
	public double monthlyFees() {
		System.out.println("Running Monthly fees");
		return 600D;
	}
	@Override
	public boolean unisex() {
		System.out.println("running unisex");
		return true;
	}

}
