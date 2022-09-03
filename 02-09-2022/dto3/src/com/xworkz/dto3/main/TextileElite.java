package com.xworkz.dto3.main;

import com.xworkz.dto3.TextileDTO;

public class TextileElite {

	public static void main(String[] args) {
		
		TextileDTO textile=new TextileDTO();
		textile.getAbrasionResistance();
		textile.getChemicalReaction();
		textile.getCohesiveness();
		textile.getColour();
		textile.getDensity();
		textile.getDimensionalStability();
		textile.getDurability();
		textile.getElasticity();
		textile.getElongation();
		textile.getFineness();
		textile.getFlexibility();
		textile.getFriction();
		textile.getLength();
		textile.getLustre();
		textile.getMeltingPoint();
		textile.setName("Rymond");
		System.out.println(textile.getName());
		textile.getPhysicalCharecterstic();
		textile.getPlace();
		textile.getRatio();
		textile.getSoftness();
		textile.setType("colth");
		System.out.println(textile.getType());
		
		TextileDTO textile1=new TextileDTO();
		textile1.getAbrasionResistance();
		textile1.getChemicalReaction();
		textile1.getCohesiveness();
		textile1.getColour();
		textile1.getDensity();
		textile1.getDimensionalStability();
		textile1.getDurability();
		textile1.getElasticity();
		textile1.getElongation();
		textile1.getFineness();
		textile1.getFlexibility();
		textile1.getFriction();
		textile1.getLength();
		textile1.getLustre();
		textile1.getMeltingPoint();
		textile1.setName("Rymond");
		System.out.println(textile1.getName());
		textile1.getPhysicalCharecterstic();
		textile1.getPlace();
		textile1.getRatio();
		textile1.getSoftness();
		textile1.setType("colth");
		System.out.println(textile1.getType());
		
		int code=textile1.hashCode();
		System.out.println(code);
		
		if (textile1.hashCode()==textile.hashCode()) {
			textile.equals(textile1);
				
		}
		else {
			System.out.println("it is not equals");
		}
		

	}
}
