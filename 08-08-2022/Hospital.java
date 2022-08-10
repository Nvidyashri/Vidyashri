class Hospital
{
	String name;
	Specialization specialization; 
	String[] equipments;  
	int consultationFees;
	Founder founder;  
	
	Hospital(String name,Specialization specialization,String[] equipments)
	{
		this.name=name;
		this.specialization=specialization;
		this.equipments=equipments;
		//System.out.println("Hospital Contructor String,String,String[]");
	}
	
	void setHospital(int consultationFees,Founder founder)
	{
		this.consultationFees=consultationFees;
		this.founder=founder;
		//System.out.println("Hospital Method Hospital int,Founder");
	}
	
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.specialization.BRIAN);
		for (int a=0; a<this.equipments.length; a++)
		{
			System.out.println(this.equipments[a]);
		}
		System.out.println(this.consultationFees);
		//System.out.println(this.founder);
		this.founder.printDatas();
	}
}