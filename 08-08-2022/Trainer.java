class Trainer
{
	String name;
	long contactNo;
	int exp;
	Gender gender;
	int age;
	
	Trainer(String name,long contactNo,int exp,Gender gender,int age)
	{
		this.name=name;
		this.contactNo=contactNo;
		this.exp=exp;
		this.gender=gender;
		this.age=age;
	}
	
	void printDatas()
	{
		System.out.println(this.name);
		System.out.println(this.contactNo);
		System.out.println(this.exp);
		System.out.println(this.gender.value);
		System.out.println(this.age);
	}
}