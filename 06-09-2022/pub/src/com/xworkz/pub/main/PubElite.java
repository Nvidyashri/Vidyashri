package com.xworkz.pub.main;

import com.xworkz.pub.DownTownPub;
import com.xworkz.pub.follower.CustomerPubRule;
import com.xworkz.pub.rules.PubRule;

public class PubElite {

	public static void main(String[] args) {
		
		PubRule pubRule = new CustomerPubRule();

		DownTownPub downTownPub = new DownTownPub(pubRule);
		downTownPub.checkRules();

	}

}
