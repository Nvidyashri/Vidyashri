package com.xworkz.polymorphism.chaild;

import com.xworkz.polymorphism.AutoMobile;

public class TataAutomobile extends AutoMobile {
	
	public TataAutomobile() {
		super();
		System.out.println("Tata default constructor");
	}

	@Override
	public void torisu() {
		super.torisu();
		System.out.println(this.type);
		System.out.println(this.brand);

	}
	
	

}
