package com.xworkz.tablet.start;

import com.xworkz.tablet.dao.TabletDAO;
import com.xworkz.tablet.dao.impl.TabletDAOImpl;
import com.xworkz.tablet.dto.TabletDTO;

public class TabletElite {

	public static void main(String[] args) {

		TabletDTO dto=new TabletDTO();
		dto.setBrandName("Dolo");
		System.out.println(dto.getBrandName());
		dto.setDrugClass("NSAIDs");
		System.out.println(dto.getDrugClass());
		dto.setManufacture("Micro Labs Ltd");
		System.out.println(dto.getManufacture());
		dto.setMedicineComposition("Paracetamol");
		System.out.println(dto.getMedicineComposition());
		dto.setMg(650);
		System.out.println(dto.getMg());
		dto.setOtherName("Acetaminophen");
		System.out.println(dto.getOtherName());
		dto.setPrice(25);
		System.out.println(dto.getPrice());
		
		TabletDAO dao=new TabletDAOImpl();
		dao.create(dto);
		
		
	}

}
