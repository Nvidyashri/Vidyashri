class BusStopRunner{
	
	public static void main(String[] args){
		
		BusStop busStop=new BusStop("Hubli New BusStop","Channama circle","Basav Van",250);
		String[] count={"prashant","sampath","vidya","deepti","sushma","divya","nayana","varshini"};
		busStop.setPassengerNames(count);
		
		double[] timeing={5.30,6,6.30,7,7.30,8,8.30,12.30,2.30,4.40};
		busStop.setTimeOfArrival(timeing);
		
		busStop.printData();
		
		
	}
}