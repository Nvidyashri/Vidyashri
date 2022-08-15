package com.xworkz.inheritence;

import com.xworkz.inheritence.Metro.*;

public class MetroRunner {

	public static void main(String[] args) {
		
		Metro metro=new Metro();
		metro.name="NAMMA METRO";
		metro.stationName="JAYANAGAR";
		metro.noOfPlatform=5;
		metro.noOfStops=10;
		metro.reservations=true;
		
		metro.torisu();
		

	}

}
