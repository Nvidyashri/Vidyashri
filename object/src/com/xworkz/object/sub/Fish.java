package com.xworkz.object.sub;

public class Fish {
	private String breed;
	private String type;
	
	public Fish() {
		
		System.out.println("Fish defoult constructor");
		
	}

	public Fish(String breed, String type) {
		//super();
		this.breed = breed;
		this.type = type;
		
	}
	public String getBreed() {
		return breed;
		
	}
	public String getType() {
		return type;
	}
	@Override
	public String toString() {
		return super.toString();
		
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
	    System.out.println("object is null");
		if(obj instanceof Fish) {
	    System.out.println("objtct is fish");
		Fish converted=(Fish)obj; //type casting
		String convertedBreed=converted.breed;
		String convertedType=converted.type;
		if(this.breed.equals(convertedBreed)&& this.type.equals(convertedType)) {
					
	    System.out.println("Fish is equal");
		return true;
	}
				
				else {
					System.out.println("Fish is not equal");
				}
				
				
			}
			else {
				System.out.println("Fish is not null");
			}
			
		}
		
		return super.equals(obj);
	}
	
	
	
}
