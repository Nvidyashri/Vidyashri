class DateRunner{
	
	public static void main(String[] args){
		
		Date date=new Date();
		date.day=12;
		date.month=5;
		date.year=1997;
		date.dayName="Monday";
		System.out.println(date.day);
		System.out.println(date.month);
		System.out.println(date.year);
		System.out.println(date.dayName);
		System.out.println("================================");
		
		Date date1=new Date(12);
		date1.month=5;
		date1.year=1997;
		date1.dayName="Monday";
		System.out.println(date1.day);
		System.out.println(date1.month);
		System.out.println(date1.year);
		System.out.println(date1.dayName);
		System.out.println("================================");
		
		Date date2=new Date(12,5);
		date2.year=1997;
		date2.dayName="Monday";
		System.out.println(date2.day);
		System.out.println(date2.month);
		System.out.println(date2.year);
		System.out.println(date2.dayName);
		System.out.println("================================");
		
		Date date3=new Date(12,5,1997);
		date3.dayName="Monday";
		System.out.println(date3.day);
		System.out.println(date3.month);
		System.out.println(date3.year);
		System.out.println(date3.dayName);
		System.out.println("================================");
		
		Date date4=new Date(12,5,1997,"Monday");
		System.out.println(date.day);
		System.out.println(date.month);
		System.out.println(date.year);
		System.out.println(date.dayName);
		
		
		
		
	}
}