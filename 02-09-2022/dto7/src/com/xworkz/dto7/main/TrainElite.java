package com.xworkz.dto7.main;

import com.xworkz.dto7.TrainDTO;

public class TrainElite {

	public static void main(String[] args) {
		
		TrainDTO train = new TrainDTO();
		train.getConformTicketApp();
		train.getConformTicketApp();
		train.getNoOfCoach();
		train.getNoOfSeats();
		train.getTicketPrice();
		train.setTrainName("Rani channamma");
		System.out.println(train.getTrainName());
		train.setTrainType("passengers train");
		System.out.println(train.getTrainType());
		train.isAcCoach();
		train.isDayTravel();
		train.isGeneralCoach();
		train.isNihtTravel();
		train.isNonAcCoach();
		train.isOfflinetickets();
		train.isOnlineTickets();
		train.isSleeperCoach();
		train.isSpecilities();
		
		TrainDTO train1 = new TrainDTO();
		train1.getConformTicketApp();
		train1.getConformTicketApp();
		train1.getNoOfCoach();
		train1.getNoOfSeats();
		train1.getTicketPrice();
		train1.setTrainName("Rani channamma");
		System.out.println(train1.getTrainName());
		train1.setTrainType("passengers train");
		System.out.println(train1.getTrainType());
		train1.isAcCoach();
		train1.isDayTravel();
		train1.isGeneralCoach();
		train1.isNihtTravel();
		train1.isNonAcCoach();
		train1.isOfflinetickets();
		train1.isOnlineTickets();
		train1.isSleeperCoach();
		train1.isSpecilities();
		
		int code=train1.hashCode();
		System.out.println(code);
		
		if (train1.hashCode()==train.hashCode()) {
			train.equals(train1);
				
		}
		else {
			System.out.println("it is not equals");
		}
		

	}

}
