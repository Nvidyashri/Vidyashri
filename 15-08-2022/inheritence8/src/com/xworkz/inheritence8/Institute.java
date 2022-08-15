package com.xworkz.inheritence8;

public class Institute {
	
	public String name = "X-Workz";
	public String mdName = "Omkar Sir";
	public String mainBranch = "Rajaji Layout";
	public String subBranch = "BTM Layout";
	public long contactNumber = 9876543210l;
	
	public Institute() 
	{
		System.out.println("Constructor of institue");
	}
	
	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.mdName);
		System.out.println(this.mainBranch);
		System.out.println(this.subBranch);
		System.out.println(this.contactNumber);
	}

}
