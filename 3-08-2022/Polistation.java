class Polistation{
	
	String name="BTM";             //literal
	int noOfStaffs;               //method
	String inspectorName;        //reference
	String[] kaidiNames;         //constructor
	
	void setNoOfStaffs(int noOfStaffs)     //method of parameters
	{   
		
	this.noOfStaffs=noOfStaffs;           //pointing current location
	}
	
	Polistation(String[] kaidiNames){    //
		
		this.kaidiNames=kaidiNames;
	}
	void print(){
		
		System.out.println(this.name);
		System.out.println(this.noOfStaffs);
		System.out.println(this.inspectorName);
		for(int count=0;count<this.kaidiNames.length;count++){
		System.out.println(this.kaidiNames[count]);
			
			
		}
		
		
	
		
	}
}