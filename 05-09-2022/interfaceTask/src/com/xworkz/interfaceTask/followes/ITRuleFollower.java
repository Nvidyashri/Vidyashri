package com.xworkz.interfaceTask.followes;

import com.xworkz.interfaceTask.bridg.HRRules;
import com.xworkz.interfaceTask.bridg.ManagerRules;
import com.xworkz.interfaceTask.bridg.SecurityRules;

public class ITRuleFollower implements HRRules, ManagerRules, SecurityRules {
	
	@Override
	public boolean swipCard() {
		System.out.println("calling swipCard");
		return true;
	}

	@Override
	public boolean parkingApproval() {
		System.out.println("calling parkingApproval");
		return true;
	}

	@Override
	public boolean informLeave() {
		System.out.println("calling informLeave");
		return true;
	}

	@Override
	public boolean wfh() {
		System.out.println("calling wfh");
		return true;
	}

	@Override
	public boolean applyLeaves() {
		System.out.println("calling applyLeaves");
		return true;
	}

	@Override
	public boolean harrasment() {
		System.out.println("calling harrasment");
		return true;
	}
	

}
