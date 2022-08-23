package com.xworkz.polymorphism;

public class Automobile {

	public String type;
	public String brand;
	
    public double sellAccessories(String name) 
    {
    	System.out.println("====sellAccessories=====");
		if (name=="Clutch") 
		{
			System.out.println("Accessories"+name);
			return 540.90d;
			
		}
		if (name=="Gear")
		{
			System.out.println("Accessories"+name);
			return 660.30d;
		}
		return 0;
		
		
	}
    
    public void setType(String type) {
    	this.type=type;
    	System.out.println("Automobile set type");
    	
    }
    public void setBrand(String brand) {
    	this.brand=brand;
    	System.out.println("Automobile set brand");
    	
    }
    public void torisu() {
    	System.out.println(this.type);
    	System.out.println(this.brand);
    }
    
}
