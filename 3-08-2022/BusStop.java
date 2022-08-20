class BusStop{
	
	String stopName;
	String StartingPoint;
	String endPoint;
	int totalBench;
	String[] passengerNames;
	double[] timeOfArrival;
	
	BusStop(String stopName,String StartingPoint,String endPoint,int totalBench){
		this.stopName=stopName;
		this.StartingPoint=StartingPoint;
		this.endPoint=endPoint;
		this.totalBench=totalBench;
		
	}
	void setPassengerNames(String[] passengerNames){
		this.passengerNames=passengerNames;
		
		
	}
	void setTimeOfArrival(double[] timeOfArrival){
		this.timeOfArrival=timeOfArrival;
		
	}
	void printData(){
		System.out.println(this.stopName);
		System.out.println(this.StartingPoint);
		System.out.println(this.endPoint);
		System.out.println(this.totalBench);
		
		for(int value=0; value<this.passengerNames.length;value++){
		System.out.println(this.passengerNames[value]);
		
		}
	   for(int value=0; value<this.timeOfArrival.length;value++){
		System.out.println(this.timeOfArrival[value]);
		
	   }
	}
}