package com.xworkz.library.main;

import com.xworkz.libaray.rules.LibraryRules;
import com.xworkz.library.followers.Readers;
import com.xworkz.library.user.LibraryStaff;

public class LibraryElite {

	public static void main(String[] args) {

		LibraryRules libraryRules=new Readers();
		LibraryStaff libraryStaff=new LibraryStaff(libraryRules);
		libraryStaff.checkRules();
		libraryStaff.maintanence();
	}

}
