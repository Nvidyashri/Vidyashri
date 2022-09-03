package com.workz.dto2.main;

import com.xworkz.dto2.VidyaDTO;

public class VidyaElite {

	public static void main(String[] args) {
		
		VidyaDTO vidya=new VidyaDTO();
		vidya.getBirthDate();
		vidya.getBirthday();
		vidya.getBirthMonth();
		vidya.getBirthYear();
		vidya.getFamilyMembers();
		vidya.getFatherName();
		vidya.getFavActor();
		vidya.getFavAnimal();
		vidya.getFavBird();
		vidya.getFavColour();
		vidya.getFavFood();
		vidya.getFavGame();
		vidya.getFavIceCreem();
		vidya.getFavMovie();
		vidya.getFavPlace();
		vidya.getFavSong();
		vidya.getHairType();
		vidya.getHeight();
		vidya.getHeight();
		vidya.getMotherName();
		vidya.setName("vidyashri");
		System.out.println(vidya.getName());
		vidya.setPlace("Hubballi");
		System.out.println(vidya.getPlace());
		vidya.isSpeaksEnglish();
		vidya.isSpeaksHindi();
		vidya.isSpeaksKannada();
		vidya.isSpeaksMarathi();
		
		VidyaDTO shri=new VidyaDTO();
		shri.getBirthDate();
		shri.getBirthday();
		shri.getBirthMonth();
		shri.getBirthYear();
		shri.getFamilyMembers();
		shri.getFatherName();
		shri.getFavActor();
		shri.getFavAnimal();
		shri.getFavBird();
		shri.getFavColour();
		shri.getFavFood();
		shri.getFavGame();
		shri.getFavIceCreem();
		shri.getFavMovie();
		shri.getFavPlace();
		shri.getFavSong();
		shri.getHairType();
		shri.getHeight();
		shri.getHeight();
		shri.getMotherName();
		shri.setName("vidyashri");
		System.out.println(shri.getName());
		shri.setPlace("Hubballi");
		System.out.println(shri.getPlace());
		shri.isSpeaksEnglish();
		shri.isSpeaksHindi();
		shri.isSpeaksKannada();
		shri.isSpeaksMarathi();
		
		int code=shri.hashCode();
		System.out.println(code);
		
		if (shri.hashCode()==vidya.hashCode()) {
			vidya.equals(shri);
				
		}
		else {
			System.out.println("it is not equals");
		}

		
		

	}

}
