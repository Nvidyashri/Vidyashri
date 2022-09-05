package com.xworkz.dto.main;

import com.xworkz.dto.YouTubDTO;

public class YouTubElite {

	public static void main(String[] args) {

		

			YouTubDTO youTube = new YouTubDTO();
			youTube.setTypeOfBussiness("subsidiary");
			youTube.setTypeofSite("Online Video PlatForm");
			youTube.setFounded(2005);
			youTube.setHqrs("US");
			youTube.setAreaServed("worldwide");
			youTube.setOwner("Alphabet");
			YouTubDTO youTube2 = new YouTubDTO();
			youTube.setTypeOfBussiness("subsidiary");
			youTube.setTypeofSite("Online Video PlatForm");
			youTube.setFounded(2005);
			youTube.setHqrs("US");
			youTube.setAreaServed("worldwide");
			youTube.setOwner("Alphabet");
			if (youTube.hashCode() == youTube2.hashCode()) {
				System.out.println("same address");
				youTube.equals(youTube2);
			} else {
				System.err.println("diff address");
			}
	}

}
