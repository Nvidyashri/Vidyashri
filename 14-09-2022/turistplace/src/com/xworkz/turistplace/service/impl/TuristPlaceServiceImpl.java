package com.xworkz.turistplace.service.impl;

import com.xworkz.turistplace.dao.TuristPlaceDAO;
import com.xworkz.turistplace.exception.TuristPlaceValidException;
import com.xworkz.turistplace.service.TuristPlaceService;

public class TuristPlaceServiceImpl implements TuristPlaceService {
	
private TuristPlaceDAO dao;
	
	public TuristPlaceServiceImpl(TuristPlaceDAO dao) {
		this.dao=dao;
	}

	@Override
	public boolean validateAndSave(String placeName) throws TuristPlaceValidException {
		if(placeName != null && placeName.length()>3 && placeName.length()<50) {
			if(this.dao.checkName(placeName)) {
				System.err.println("name already present");
				throw new TuristPlaceValidException("name exist");
			}else {
				System.out.println("does not exist present");
				this.dao.store(placeName);
				return true;
			}
		}else {
			System.out.println("Invalid");
			throw new TuristPlaceValidException("not a name");
		}
	}

}