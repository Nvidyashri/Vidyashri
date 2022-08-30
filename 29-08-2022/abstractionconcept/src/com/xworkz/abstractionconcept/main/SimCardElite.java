package com.xworkz.abstractionconcept.main;

import com.xworkz.abstractionconcept.SimCard;
import com.xworkz.abstractionconcept.postpaid.Postpaid;
import com.xworkz.abstratonconcept.prepaid.Prepaid;


public class SimCardElite {

	public static void main(String[] args){
		
//		Prepaid.call();
			SimCard prepaid=new Prepaid();
			//prepaid.call();
			prepaid.checkBalance();
			//prepaid.network();
			prepaid.smsService();
			Prepaid con = (Prepaid)prepaid;  //type casting
			con.display();
			System.out.println("Post Paid Class Properties");
			Postpaid postpaid=new Postpaid();
			postpaid.call();
			postpaid.checkBalance();
			postpaid.smsService();
			postpaid.network();
			System.out.println("Type Casting");
			
		
		

	}

}
