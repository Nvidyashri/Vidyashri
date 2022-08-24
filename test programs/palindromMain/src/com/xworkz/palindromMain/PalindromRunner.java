package com.xworkz.palindromMain;

public class PalindromRunner {

	public static void main(String[] args) {
		// How to check if a string is a palindrome?
				String movie = "nayan";
				StringBuffer buffer = new StringBuffer(movie);
				buffer.reverse();
				String data = buffer.toString();
				if (movie.equals(data)) {
					System.out.println("revers the name is nayan");
				} else {
					System.out.println("dont revers the name is nayan");
				}

	}

}
 