class AppleWatch{
	public static void set(){
		int price=35000;
		String brand="Apple Watch";
		String colour="black";
		System.out.println("price:" +price);
		System.out.println("brand:" +brand);
		System.out.println("colour:" +colour);
		System.out.println("Watch is going to set alaram and time");
		setAlaram();
		setTime();
		
	}
	public static void setAlaram(){
		System.out.println("alaram is set to 05:00AM");
		
	}
	public static void setTime(){
		System.out.println("time was set");
		
	}
	public static void main(String[] args){
		set();
	}
}
