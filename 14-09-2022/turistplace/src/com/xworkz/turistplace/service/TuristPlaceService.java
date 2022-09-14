package com.xworkz.turistplace.service;

import com.xworkz.turistplace.exception.TuristPlaceValidException;

public interface TuristPlaceService {
	
	boolean validateAndSave(String placeName) throws TuristPlaceValidException;
	
	
}
