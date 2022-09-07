package com.xworkz.library.followers;

import com.xworkz.libaray.rules.LibraryRules;

public class Readers implements LibraryRules {
	
	@Override
	public boolean mobilesAreAllowed() {
		System.out.println("mobiles are not allowed");
		return true;
	}
	@Override
	public boolean allowedBooksToTakeHome() {
		System.out.println("books are not allowed to take home");
		return true;
	}
	@Override
	public double monthlyFees() {
		System.out.println("Running monthly fees");
		return 50;
	}

}
