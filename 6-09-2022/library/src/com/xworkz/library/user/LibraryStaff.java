package com.xworkz.library.user;

import com.xworkz.libaray.rules.LibraryRules;

public class LibraryStaff {
	
	private LibraryRules libraryRules;
	
	public LibraryStaff(LibraryRules libraryRules) {
		this.libraryRules=libraryRules;
		
	}
	public void checkRules() {
		System.out.println("checking the rules");
		boolean mobile=libraryRules.mobilesAreAllowed();
		boolean books=libraryRules.allowedBooksToTakeHome();
		double fees=libraryRules.monthlyFees();
		if(mobile && books && fees>50) {
			System.out.println("Rules are followed");
			
		}
		else {
			System.out.println("Rules are not followed");
			
		}
	}
	public void maintanence() {
		System.out.println("maintaining the library");

	}

}
