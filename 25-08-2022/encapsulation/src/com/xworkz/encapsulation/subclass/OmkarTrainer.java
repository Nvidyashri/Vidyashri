package com.xworkz.encapsulation.subclass;

import com.xworkz.encapsulation.sup.Trainer;

public class OmkarTrainer extends Trainer {
	
public OmkarTrainer() {
	System.out.println("defoult constructor");
	
}
public OmkarTrainer(String name, String specialization,int experience) {
	super.name=name;
	super.specialization=specialization;
	super.experience=experience;
}
@Override
public boolean setTraining() {
	return super.setTraining();
	
}
@Override
public boolean setConductIneterview() {
	return super.setConductIneterview();
	
}
@Override
public String setCoding() {
	return super.setCoding();
	
}
//Getter method
//Encapsulation
public String getName() {
	super.name=name;
	return name;
	
}
public int getExperience() {
	super.experience=experience;
	return experience;
	
}
public String getSpecialization() {
	super.specialization=specialization;
	return specialization;
	
}



	

}
