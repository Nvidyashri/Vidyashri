class ChocolateRunner{
	
	public static void main(String[] args){
		
	Chocolate chocolate=new Chocolate();
	chocolate.name="Cadbury Dairy Milk";
	chocolate.flavour="Roast Almond Chocolate Bars";
	chocolate.brand="Cadbury";
	chocolate.price=190;
	System.out.println(chocolate.name);
	System.out.println(chocolate.flavour);
	System.out.println(chocolate.brand);
	System.out.println(chocolate.price);
	System.out.println("==============================");
	
	Chocolate chocolate1=new Chocolate("Cadbury Dairy Milk");
	chocolate1.flavour="Roast Almond Chocolate Bars";
	chocolate1.brand="Cadbury";
	chocolate1.price=190;
	System.out.println(chocolate1.name);
	System.out.println(chocolate1.flavour);
	System.out.println(chocolate1.brand);
	System.out.println(chocolate1.price);
	System.out.println("==============================");
	
	Chocolate chocolate2=new Chocolate("Cadbury Dairy Milk","Roast Almond Chocolate Bars");
	chocolate2.brand="Cadbury";
	chocolate2.price=190;
	System.out.println(chocolate2.name);
	System.out.println(chocolate2.flavour);
	System.out.println(chocolate2.brand);
	System.out.println(chocolate2.price);
	System.out.println("==============================");
	
	Chocolate chocolate3=new Chocolate("Cadbury Dairy Milk","Roast Almond Chocolate Bars","Cadbury");
	chocolate3.price=190;
	System.out.println(chocolate3.name);
	System.out.println(chocolate3.flavour);
	System.out.println(chocolate3.brand);
	System.out.println(chocolate3.price);
	System.out.println("==============================");
	
	Chocolate chocolate4=new Chocolate("Cadbury Dairy Milk","Roast Almond Chocolate Bars","Cadbury",190);
	System.out.println(chocolate4.name);
	System.out.println(chocolate4.flavour);
	System.out.println(chocolate4.brand);
	System.out.println(chocolate4.price);
	System.out.println("==============================");
	
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	

