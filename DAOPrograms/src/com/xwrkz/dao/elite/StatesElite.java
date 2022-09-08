package com.xwrkz.dao.elite;

import com.xwrkz.implementdao.StateDAOImplementer;

public class StatesElite {

	public static void main(String[] args) {

		StateDAOImplementer implementr = new StateDAOImplementer();
		implementr.save("Assam");
		implementr.save("Bihar");
		implementr.save("Chattisghar");
		implementr.save("Karnataka");
		implementr.save("Goa");
		implementr.save("Gujarat");
		implementr.save("Haryana");
		implementr.save("Himachal Pradesh");
		implementr.save("Bihar");
		implementr.save("Jammu Kashmir");
		implementr.save("Jharkhand");
		implementr.save("Kerala");
		implementr.save("Maharastra");
		implementr.save("Manipur");
		implementr.save("Nagaland");
		implementr.save("Odisa");
		implementr.save("Punjab");
		implementr.save("Rajastan");
		implementr.save("Tamil Nadu");
		implementr.save("UttaraKhand");

		implementr.printlnAllStates();

	}

}
