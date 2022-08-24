package com.xworkz.overriding;

public class AutoMobile {
	
	public String type;
	public String brand;
	

	double sellAccessories(String name) {
		if (name == "Clutch") {
			System.out.println("Accessories" + name);
			return 4000.0d;
		}

		if (name == "Gear") {
			System.out.println("Accessories" + name);
			return 5000.0d;
		}
		return 0.0d;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setType(String type) {
		this.type = type;
	}

	protected void torisu() {
		System.out.println(this.type);
		System.out.println(this.brand);
	}

}
