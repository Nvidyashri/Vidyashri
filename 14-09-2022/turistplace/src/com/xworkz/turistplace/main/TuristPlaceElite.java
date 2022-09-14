package com.xworkz.turistplace.main;

import com.xworkz.turistplace.dao.TuristPlaceDAO;
import com.xworkz.turistplace.dao.impl.TuristPlaceDAOImpl;
import com.xworkz.turistplace.exception.TuristPlaceValidException;
import com.xworkz.turistplace.service.TuristPlaceService;
import com.xworkz.turistplace.service.impl.TuristPlaceServiceImpl;

public class TuristPlaceElite {
	
	public static void main(String[] args) {

		TuristPlaceDAO dao = new TuristPlaceDAOImpl();

		TuristPlaceService service = new TuristPlaceServiceImpl(dao);
		try {
			service.validateAndSave("Mysore");
			service.validateAndSave("Hampi");
			service.validateAndSave("Gokarna");
			service.validateAndSave("Udupi");
			service.validateAndSave("Chikmangalur");
			service.validateAndSave("Jog Falls");
			service.validateAndSave("Murdeshwar");
			service.validateAndSave("Dandeli");
			service.validateAndSave("Kemmanagundi");
			service.validateAndSave("Kudremukh");
			service.validateAndSave("Pattad Kall");


		} catch (TuristPlaceValidException omg) {
			System.out.println("handled");
		}

	}

}


