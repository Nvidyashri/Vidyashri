package com.xworkz.primeminister.service;

import com.xworkz.primeminister.exception.InvalidPrimeMinisterException;

public interface PrimeMinisterService {
	
	boolean validateAndSave(String name) throws InvalidPrimeMinisterException;

}
