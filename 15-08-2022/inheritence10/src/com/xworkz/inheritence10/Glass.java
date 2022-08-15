package com.xworkz.inheritence10;

public class Glass {
	
	public String mirrorFrameColor = "Black";
	public String mirrorFrameMaterial = "Fiber";
	public int lengthInInche = 15;
	public int breadthInInche = 7;
	public int price = 200;
	
	public Glass() 
	{
		System.out.println("Constructor of glass");
	}
	
	public void torisu()
	{
		System.out.println(this.mirrorFrameColor);
		System.out.println(this.mirrorFrameMaterial);
		System.out.println(this.lengthInInche);
		System.out.println(this.breadthInInche);
		System.out.println(this.price);
	}

}
