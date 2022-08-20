class Chocolate{
	
	String name;
	String flavour;
	String brand;
	int price;
	
	Chocolate(){
	System.out.println("Defoult constructor found");
	
	}
	Chocolate(String name){
		this();
		this.name=name;
		System.out.println("String constructor found");
		
	}
	Chocolate(String name,String flavour){
		this(name);
		this.flavour=flavour;
		System.out.println("String,String constructor found");
		
	}
	Chocolate(String name,String flavour,String brand){
		this(name,flavour);
		this.brand=brand;
		System.out.println("String,String,String constructor found");
		
	}
	Chocolate(String name,String flavour,String brand,int price){
		this(name,flavour,brand);
		this.price=price;
		System.out.println("String,String,String,int constructor found");
		
	}
	
	
	
}