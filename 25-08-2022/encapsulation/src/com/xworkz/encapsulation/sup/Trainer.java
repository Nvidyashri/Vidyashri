package com.xworkz.encapsulation.sup;

public class Trainer {
	
	protected String name;
	protected int experience;
	protected String specialization;
	
	protected Trainer(){
		System.out.println("trainer defoult constructor");
		
	}
	protected Trainer(String name,int experience,String specialization){
		this.name=name;
		this.experience=experience;
		this.specialization=specialization;
		
   }
	protected boolean setTraining() {
		System.out.println("trainer training");
		return true;
		
	}
	protected boolean setConductIneterview() {
		System.out.println("interview conductor in training");
		return true;
		
	}
	protected String setCoding() {
		System.out.println("trainer teach coding");
		return "java";
		
	}
	

}
