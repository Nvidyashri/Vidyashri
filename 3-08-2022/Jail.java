class Jail{
	
	String name;
	int noOfCells;
	int noOfGates;
	String[] staffNames;
	
	Jail(String name,int noOfCells){
		this.name=name;
		this.noOfCells=noOfCells;
			
	}
	void setNoOfGates(int noOfGates){
		this.noOfGates=noOfGates;
		
	}
	void setStaffNames(String[] staffNames){
		this.staffNames=staffNames;
		
		
	}
	void printData(){
		System.out.println(this.name);
		System.out.println(this.noOfCells);
		System.out.println(this.noOfGates);
		
		for(int count=0; count<this.staffNames.length;count++){
		System.out.println(this.staffNames[count]);
		
		}
	}
}