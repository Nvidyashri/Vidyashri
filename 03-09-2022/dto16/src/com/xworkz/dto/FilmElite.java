package com.xworkz.dto;

public class FilmElite {

	public static void main(String[] args) {
		
		FilmDTO f = new FilmDTO();
		f.setName("Raja Kumar");
		f.setLanguage("Kannada");

		FilmDTO f1 = new FilmDTO();
		f1.setName("Raja Kumar");
		f1.setLanguage("Kannada");

		if (f.hashCode() == f1.hashCode()) {
			System.out.println(f.equals(f1));
		} else {
			System.err.println("it is not equal");
		}


	}

}

