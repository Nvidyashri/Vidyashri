package com.xworkz.alcohol.dao.impl;

import com.xworkz.alcohol.dao.AlcoholDAO;
import com.xworkz.alcohol.dto.AlcoholDTO;

public class AlcoholDAOImpl implements AlcoholDAO{
	
	private AlcoholDTO[] alcohol=new AlcoholDTO[14];
	private int index=0;
	
	@Override
	public boolean creat(AlcoholDTO dto) {
		this.alcohol[index]=dto;
		System.out.println("Alcohol,"+dto+"into index"+this.index);
		this.index++;
		return true;
	}
	

}
