package com.xworkz.appartment.dao.impl;

import com.xworkz.appartment.dao.AppartmentDAO;
import com.xworkz.appartment.dto.AppartmentDTO;


public class AppartentDAOImpl implements AppartmentDAO {
	
	private AppartmentDTO[] movies = new AppartmentDTO[14];
	private int index = 0;

	@Override
	public boolean create(AppartmentDTO dto) {
		System.out.println("Appartment is saved,"+dto +"into index"+this);
		this.index++;
		return true;
	}
	
}
