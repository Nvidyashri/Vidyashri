class Alcohol
{
	static String alcoholCompany;
	String alcoholType;
	int liter;
	int price;

	Alcohol(String company)
	{
		alcoholCompany=company;
		System.out.println("Information About Alcohol");
	}
	
	Alcohol(String type, int lit, int pr)
	{
		alcoholType=type;
		liter=lit;
		price=pr;
	}
}