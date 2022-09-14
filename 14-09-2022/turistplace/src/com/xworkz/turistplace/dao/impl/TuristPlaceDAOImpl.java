package com.xworkz.turistplace.dao.impl;

import com.xworkz.turistplace.dao.TuristPlaceDAO;

public class TuristPlaceDAOImpl implements TuristPlaceDAO {
	
	private String[] storeNames = new String[10];
	private int index;

	@Override
	public boolean store(String placeName) {
		this.storeNames[index] = placeName;
		System.out.println(placeName);
		this.index++;
		return false;
	}

	@Override
	public boolean checkName(String placeName) {
		for (String ref : storeNames) {
			if (ref != null && ref.equals(placeName)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}