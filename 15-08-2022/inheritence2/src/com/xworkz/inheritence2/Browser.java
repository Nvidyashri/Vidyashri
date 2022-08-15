package com.xworkz.inheritence2;

public class Browser {
	
	public double storage=40;
	public String website="www.google.in";
	public String searchWay="Easy";
	public boolean safeSearch=true;
	public String ownerName="Sunder pichi";
	
	public Browser() {
		
		System.out.println("Chrome constructore");
	
		
	}
	
	public void torisu() {
		
		System.out.println(this.storage);
		System.out.println(this.website);
		System.out.println(this.searchWay);
		System.out.println(this.safeSearch);
		System.out.println(this.ownerName);
	}

}
