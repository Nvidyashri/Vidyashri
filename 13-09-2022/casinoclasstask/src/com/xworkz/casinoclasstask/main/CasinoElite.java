package com.xworkz.casinoclasstask.main;

import com.xworkz.casinoclasstask.dao.CasinoDAO;
import com.xworkz.casinoclasstask.impl.CasinoDAOImpl;
import com.xworkz.casinoclasstask.service.impl.CasinoServiceImpl;
import com.xworkz.casinoclasstask.service.star.CasinoService;

public class CasinoElite {
	
	public static void main(String[] args) {

      CasinoDAO dao = new CasinoDAOImpl();
      
      CasinoService service = new CasinoServiceImpl();
      boolean serve=service.validateAndSave(null);
      System.out.println(serve);
		
		

	

}
}
