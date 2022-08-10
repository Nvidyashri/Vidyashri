class IceCream{
	
	String flavour;
    double price;
    String type;
    String color;
    String brand;
    double weight;
    double quantity;
    boolean dryFruit;
    boolean goodTaste;
    int since;
	
	IceCream(){
		System.out.println("Defoult constructor found");
		
	}
	IceCream(String flavour){
		this();
		this.flavour=flavour;
		System.out.println("String constructor found");
			
	}
	IceCream(String flavour,double price){
		this(flavour);
		this.price=price;
		System.out.println("String,double constructor found");
		
	}
	IceCream(String flavour,double price,String type){
		this(flavour,price);
		this.type=type;
		System.out.println("String,double,String constructor found");
	}	
	IceCream(String flavour,double price,String type,String color){
		this(flavour,price,type);
		this.color=color;
		System.out.println("String,double,String,String constructor found");
			
	}
	IceCream(String flavour,double price,String type,String color,String brand){
		this(flavour,price,type,color);
		this.brand=brand;
		System.out.println("String,double,String,String,String constructor found");
		
	}
	IceCream(String flavour,double price,String type,String color,String brand,double weight){
		this(flavour,price,type,color,brand);
		this.weight=weight;
		System.out.println("String,double,String,String,String,double constructor found");
		
	}
	IceCream(String flavour,double price,String type,String color,String brand,double weight,double quantity){
		this(flavour,price,type,color,brand,weight);
		this.quantity=quantity;
		System.out.println("String,double,String,String,String,double,double constructor found");
		
	}
	IceCream(String flavour,double price,String type,String color,String brand,double weight,double quantity,boolean dryFruit){
	    this(flavour,price,type,color,brand,weight,quantity);
	    this.dryFruit=dryFruit;
	System.out.println("String,double,String,String,String,double,double,boolean constructor found");
	
	}
	IceCream(String flavour,double price,String type,String color,String brand,double weight,double quantity,boolean dryFruit,boolean goodTaste){
	    this(flavour,price,type,color,brand,weight,quantity,goodTaste);
        this.goodTaste=goodTaste;
    System.out.println("String,double,String,String,String,double,double,boolean,boolean constructor found");	
		
	}
	IceCream(String flavour,double price,String type,String color,String brand,double weight,double quantity,boolean dryFruit,boolean goodTaste,int since){
	    this(flavour,price,type,color,brand,weight,quantity,goodTaste);
	     this.since=since;
     System.out.println("String,double,String,String,String,double,double,boolean,boolean,int constructor found");	
		
	}
	
	
	
	
	
	
	
	
	
	

}