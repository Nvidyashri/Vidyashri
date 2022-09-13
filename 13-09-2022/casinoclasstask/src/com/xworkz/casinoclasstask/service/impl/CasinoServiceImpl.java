package com.xworkz.casinoclasstask.service.impl;

import com.xworkz.casinoclasstask.dao.CasinoDAO;
import com.xworkz.casinoclasstask.impl.CasinoDAOImpl;
import com.xworkz.casinoclasstask.service.star.CasinoService;

public class CasinoServiceImpl implements CasinoService{
	
	private CasinoDAO casinoDAO;

	public CasinoServiceImpl() {
		this.casinoDAO=casinoDAO;
	}
	
	
        

	
	@Override
	public boolean validateAndSave(String name) {
		if(name!=null && name.length()>2 && name.length()<50) {
			casinoDAO.save(name);
	        return true;
	}
		else {
			System.out.println("invalid");
		}
		return false;
}
}