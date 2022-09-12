package com.xworkz.alcohol.start;

import com.xworkz.alcohol.dao.AlcoholDAO;
import com.xworkz.alcohol.dao.impl.AlcoholDAOImpl;
import com.xworkz.alcohol.dto.AlcoholDTO;

public class AlcoholElite {

	public static void main(String[] args) {

		AlcoholDTO alco = new AlcoholDTO();
		alco.setPh(7.33);
		System.out.println(alco.getPh());
		alco.setBoilingPoint(78);
		System.out.println(alco.getBoilingPoint());
		alco.setDensity(780);
		System.out.println(alco.getDensity());
		
		AlcoholDAO alcohol=new AlcoholDAOImpl();
		alcohol.creat(alco);
	}

}
