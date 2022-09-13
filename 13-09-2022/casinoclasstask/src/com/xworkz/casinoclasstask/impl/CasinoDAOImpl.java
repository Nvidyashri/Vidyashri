package com.xworkz.casinoclasstask.impl;

import com.xworkz.casinoclasstask.dao.CasinoDAO;

public class CasinoDAOImpl implements CasinoDAO {
	
	private String[] names=new String[5];
	private int index;

	@Override
	public boolean save(String name) {
		this.names[index]=name;
		System.out.println("data stored" + name + "index" +this.index);
		this.index++;
		return true;
	}
	
@Override
public boolean checkName(String name) {
	return true;
}
	
	

}
