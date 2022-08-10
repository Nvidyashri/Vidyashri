class Biscuit{
	
	String brand;
	int price;
	int expiryDate;
	double weight;
	String manufacturedBy;
	int quantity;
	int noOfPieces;
	
	
	Biscuit(){
	System.out.println("Defoult Constructor found");	
		
	}
	Biscuit(String brand){
		this();
		this.brand=brand;
		System.out.println("String Constructor found");
		
	}
	Biscuit(String brand,int price){
		this(brand);
		this.price=price;
		System.out.println("String,int Constructor found");
	}
	Biscuit(String brand,int price,int expiryDate){
		this(brand,price);
		this.expiryDate=expiryDate;
		System.out.println("String,int,int,Constructor found");
	}
	Biscuit(String brand,int price,int expiryDate,double weight){
		this(brand,price,expiryDate);
		this.weight=weight;
		System.out.println("String,int,int,double Constructor found");
	}
	Biscuit(String brand,int price,int expiryDate,double weight,String manufacturedBy){
		this(brand,price,expiryDate,weight);
		this.manufacturedBy=manufacturedBy;
		System.out.println("String,int,int,double,String Constructor found");
	}
	Biscuit(String brand,int price,int expiryDate,double weight,String manufacturedBy,int quantity){
		this(brand,price,expiryDate,weight,manufacturedBy);
		this.quantity=quantity;
		System.out.println("String,int,int,double,String,int Constructor found");
				
	}	
	Biscuit(String brand,int price,int expiryDate,double weight,String manufacturedBy,int quantity,int noOfPieces){
		this(brand,price,expiryDate,weight,manufacturedBy,quantity);
		this.noOfPieces=noOfPieces;
		System.out.println("String,int,int,double,String,int,int Constructor found");
	}	
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
