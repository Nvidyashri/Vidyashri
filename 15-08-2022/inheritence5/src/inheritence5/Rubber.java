package inheritence5;

public class Rubber {
	
	public String shape = "Round";
	public String color = "Yellow";
	public int price = 120;
	public String madeCountry = "India";
	public String Type = "Tennis Ball";
	
	public Rubber() 
	{
		System.out.println("Constructor of Rubber");
	}
	
	public void torisu()
	{
		System.out.println(this.shape);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.madeCountry);
		System.out.println(this.Type);

}
}
