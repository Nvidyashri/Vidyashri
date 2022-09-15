package com.xworkz.primeminister.DAO;

import com.xworkz.primeminister.exception.InvalidIndexException;

public interface PrimeMinisterDAO {
	
    boolean save(String name) throws InvalidIndexException;
	
	boolean checkName(String name);


}
