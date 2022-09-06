package com.xworkz.pub.follower;

import com.xworkz.pub.rules.PubRule;

public class CustomerPubRule  implements PubRule {
	
	@Override
	public boolean dressCodeFollowed() {
		System.out.println("dresscode code of the person");
		return true;
	}

	@Override
	public int age() {
		System.out.println("age of the person");
		return 24;
	}

	@Override
	public boolean validProof() {
		System.out.println("valid proof of the persons");
		return true;
	}
	
	

}
