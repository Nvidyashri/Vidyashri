package com.xworkz.speaker.start;

import com.xworkz.speaker.dao.SpeakerDAO;
import com.xworkz.speaker.dao.impl.SpeakerDAOImpl;
import com.xworkz.speaker.dto.SpeakerDTO;

public class SpeakerElite {

	public static void main(String[] args) {

		SpeakerDTO dto=new SpeakerDTO();
		dto.setBrandName("TARBULL");
		dto.setType("Head Phones");
		dto.setMagnet(true);
		dto.setBatteryLast(22d);
		dto.setWireconnection(true);
		String[] headPhoneBuilt= {"MicroPhone"};
		dto.setHeadphonesbuilt(headPhoneBuilt);
		dto.setHeadPhonesCost(2100d);
		String[] batteryType= {"LiPo battery"};
		dto.setBatteryType(batteryType);
		dto.setBluetoothVersion(5);
		dto.setPreferredProvider("Music Preferred");
		
		SpeakerDAO dao=new SpeakerDAOImpl();
		dao.create(dto);
	}

}
