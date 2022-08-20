class YellowUmbrella{
public static void protectFromrain(){
	System.out.println("protected from rain");
	open();
}
public static void protectFromsun(){
	System.out.println("protected from sun");
	open();
}
public static void open(){
	System.out.println("umbrella turn open");
	
}
public static void shut(){
	System.out.println("umbrella turned close");
}
public static void main(String[] args){
	protectFromrain();
	protectFromsun();
	shut();
	
}
}