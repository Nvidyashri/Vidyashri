package com.xworkz.overriding.chaild;

import com.xworkz.overriding.AutoMobile;

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
