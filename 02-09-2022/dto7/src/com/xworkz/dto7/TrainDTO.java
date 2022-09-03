package com.xworkz.dto7;


public class TrainDTO {
	
	private String trainName;
	private String trainType;
	private int noOfCoach;
	private int noOfSeats;
	private boolean sleeperCoach;
	private boolean generalCoach;
	private boolean acCoach;
	private boolean nonAcCoach;
	private int ticketPrice;
	private boolean nihtTravel;
	private boolean dayTravel;
	private boolean specilities;
	private boolean onlineTickets;
	private boolean offlinetickets;
	private String conformTicketApp;
	
	@Override
	public int hashCode() {
		return 150;
	}
	@Override
	public boolean equals(Object obj) {
		
		if (obj != null ) {
			System.out.println("it is not equal");
			if(obj instanceof TrainDTO) {
				System.out.println("it is a instanceof plant");
				TrainDTO converted=(TrainDTO) obj;//casting
				 if(converted.trainName.equals(this.trainName)&& converted.trainType.equals(this.trainType)) {
					  System.out.println("name and trainType are equal");
				
			}
				 else {
					 System.out.println("name and trainType are not equal");
				 }
		}
			else {
				System.out.println("both are equal");
			}
		}
		return super.equals(obj);
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getTrainType() {
		return trainType;
	}
	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}
	public int getNoOfCoach() {
		return noOfCoach;
	}
	public void setNoOfCoach(int noOfCoach) {
		this.noOfCoach = noOfCoach;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public boolean isSleeperCoach() {
		return sleeperCoach;
	}
	public void setSleeperCoach(boolean sleeperCoach) {
		this.sleeperCoach = sleeperCoach;
	}
	public boolean isGeneralCoach() {
		return generalCoach;
	}
	public void setGeneralCoach(boolean generalCoach) {
		this.generalCoach = generalCoach;
	}
	public boolean isAcCoach() {
		return acCoach;
	}
	public void setAcCoach(boolean acCoach) {
		this.acCoach = acCoach;
	}
	public boolean isNonAcCoach() {
		return nonAcCoach;
	}
	public void setNonAcCoach(boolean nonAcCoach) {
		this.nonAcCoach = nonAcCoach;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public boolean isNihtTravel() {
		return nihtTravel;
	}
	public void setNihtTravel(boolean nihtTravel) {
		this.nihtTravel = nihtTravel;
	}
	public boolean isDayTravel() {
		return dayTravel;
	}
	public void setDayTravel(boolean dayTravel) {
		this.dayTravel = dayTravel;
	}
	public boolean isSpecilities() {
		return specilities;
	}
	public void setSpecilities(boolean specilities) {
		this.specilities = specilities;
	}
	public boolean isOnlineTickets() {
		return onlineTickets;
	}
	public void setOnlineTickets(boolean onlineTickets) {
		this.onlineTickets = onlineTickets;
	}
	public boolean isOfflinetickets() {
		return offlinetickets;
	}
	public void setOfflinetickets(boolean offlinetickets) {
		this.offlinetickets = offlinetickets;
	}
	public String getConformTicketApp() {
		return conformTicketApp;
	}
	public void setConformTicketApp(String conformTicketApp) {
		this.conformTicketApp = conformTicketApp;
	}
	
	

}
