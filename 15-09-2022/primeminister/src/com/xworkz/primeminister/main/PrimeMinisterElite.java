package com.xworkz.primeminister.main;

import com.xworkz.primeminister.DAO.PrimeMinisterDAO;
import com.xworkz.primeminister.DAO.Impl.PrimeMinisterDAOimpl;
import com.xworkz.primeminister.exception.InvalidPrimeMinisterException;
import com.xworkz.primeminister.service.PrimeMinisterService;
import com.xworkz.primeminister.service.Impl.PrimeMinisterServiceimpl;

public class PrimeMinisterElite {

	public static void main(String[] args) {

PrimeMinisterDAO dao=new PrimeMinisterDAOimpl();
		
		PrimeMinisterService serviceimpl = new PrimeMinisterServiceimpl(dao);
		try {
			serviceimpl.validateAndSave("Narendra Modi");
			serviceimpl.validateAndSave("Jawahar lal Nehru");
			serviceimpl.validateAndSave("ManmohanSingh");
			serviceimpl.validateAndSave("Indira Gandhi");
			serviceimpl.validateAndSave("Morarji Desai");
			//serviceimpl.validateAndSave("Rajiv Gandhi");
		}
		catch(InvalidPrimeMinisterException ipme) {
			System.out.println(ipme.getMessage());
			}

  }
}
