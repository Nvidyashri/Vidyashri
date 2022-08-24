package com.xworkz.overridingextend.chaild;
import com.xworkz.overridingextend.Automobile;


public class TataAutoMobile extends Automobile {
	
	public TataAutoMobile() {
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
