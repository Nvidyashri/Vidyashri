package com.xworkz.javadao.implementr;

import com.xworkz.javadao.dao.LakeDAO;

public class LakeDaoImolementr implements LakeDAO{
	
	private String[] lakeNames=new String[10];
	
	@Override
	public boolean save(String lakeName) {
		for(int i=0;i < lakeNames.length; i++) {
			if(lakeNames[i]==null) {
				lakeNames[i]=lakeName;
				break;
			}
		}
		return true;
	}
	@Override
	public void printlnAllLakes() {

		for(int i=0; i<lakeNames.length; i++) {
			System.out.println(lakeNames[i]);
		}
	}

}
