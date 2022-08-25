package com.xworkz.encapsulation.main;

import com.xworkz.encapsulation.subclass.OmkarTrainer;

public class OmkarMain {
	
	public static void main(String[] args) {
		OmkarTrainer om=new OmkarTrainer("omkar","software devloper",12);
		int see=om.getExperience();
		System.out.println(see);
		System.out.println(om.getSpecialization());
		System.out.println(om.getName());
		System.out.println(om.setCoding());
		System.out.println(om.setConductIneterview());
		System.out.println(om.setTraining());
		
		
		OmkarTrainer om1=new OmkarTrainer("omkar1","software engineer",10);
		int see1=om1.getExperience();
		System.out.println(see1);
		System.out.println(om1.getSpecialization());
		System.out.println(om1.getName());
		System.out.println(om1.setCoding());
		System.out.println(om1.setConductIneterview());
		System.out.println(om1.setTraining());
	}

}
