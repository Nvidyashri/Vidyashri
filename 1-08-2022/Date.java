class Date{
	
	int day;
	int month;
	int year;
	String dayName;
	
	Date(){
		System.out.println("defoult constructor found");
		
	}
	Date(int day){
		this();
		this.day=day;
		System.out.println("int  constructor found");
		
	}
	Date(int day,int month){
		this(day);
		this.month=month;
		System.out.println("int,int constructor found");
	
	}
	Date(int day,int month,int year){
		this(day,month);
		this.year=year;
		System.out.println("int,int,int constructor found");
	
	}
	Date(int day,int month,int year,String dayName){
		this(day,month,year);
		this.dayName=dayName;
		System.out.println("int,int,int,String constructor found");
			
	}
	
	
}