class Umbrella{
	static void protectFromRain(){
		System.out.println("Hevy raining from morning");
		open();
		
	}
	static void protectFromsun(){
		System.out.println("Take care from sun");
		open();
		
	}
	static void shut(){
		System.out.println("Shut the umbrella");
		
	}
	static void open(){
		System.out.println("Open the umbrella");
		
	}
	public static void main(String[] args){
		protectFromRain();
		protectFromsun();
		shut();
		
	}
}