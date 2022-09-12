package com.xworkz.tablet.dao.impl;

import com.xworkz.tablet.dao.TabletDAO;
import com.xworkz.tablet.dto.TabletDTO;

public class TabletDAOImpl implements TabletDAO {
	
	private TabletDTO[] tablets=new TabletDTO[14];
	private int index=0;
	
	@Override
	public boolean create(TabletDTO dto) {
		
		this.tablets[index]=dto;
		System.out.println("Tablet is saved,"+dto+"into index"+this.index);
		this.index++;
		return true;
	}
	

}
