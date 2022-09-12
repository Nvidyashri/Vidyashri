package com.xworkz.appartment.start;

import com.xworkz.appartment.dao.AppartmentDAO;
import com.xworkz.appartment.dao.impl.AppartentDAOImpl;
import com.xworkz.appartment.dto.AppartmentDTO;

public class AppartmentElite {

	public static void main(String[] args) {

		AppartmentDTO dto = new AppartmentDTO();
		dto.setName("Shanta Appartment");
		System.out.println(dto.getName());
		dto.setPlace("Hubli");
		System.out.println(dto.getPlace());
		dto.setOwnerName("Kamala");
		System.out.println(dto.getOwnerName());
		dto.setRent(10000);
		System.out.println(dto.getRent());
		dto.setPaymentType("Online");
		System.out.println(dto.getPaymentType());
		
		AppartmentDAO dao=new AppartentDAOImpl();
		dao.create(dto);
		
		
		
		
		
		
		
	}

}
