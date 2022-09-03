package com.xworkz.dto6.main;

import com.xworkz.dto6.MobileDTO;

public class MobileElite {

	public static void main(String[] args) {
		
		MobileDTO mobile=new MobileDTO();
		mobile.getBattery();
		mobile.getBrand();
		mobile.getCamera();
		mobile.getDataConnection();
		mobile.getFrontCamFixel();
		mobile.getInternalMemory();
		mobile.setName("samsung");
		System.out.println(mobile.getName());
		mobile.getPrice();
		mobile.getRam();
		mobile.getRom();
		mobile.getSize();
		mobile.getStorage();
		mobile.getTotalNoOfApps();
		mobile.getTouchScreen();
		mobile.setType("touch screen");
		System.out.println(mobile.getType());
		mobile.getVarrenty();
		mobile.getWifi();
		
		MobileDTO mobile1=new MobileDTO();
		mobile1.getBattery();
		mobile1.getBrand();
		mobile1.getCamera();
		mobile1.getDataConnection();
		mobile1.getFrontCamFixel();
		mobile1.getInternalMemory();
		mobile1.setName("samsung");
		System.out.println(mobile1.getName());
		mobile1.getPrice();
		mobile1.getRam();
		mobile1.getRom();
		mobile1.getSize();
		mobile1.getStorage();
		mobile1.getTotalNoOfApps();
		mobile1.getTouchScreen();
		mobile1.setType("touch screen");
		System.out.println(mobile1.getType());
		mobile1.getVarrenty();
		mobile1.getWifi();
		
		int code=mobile1.hashCode();
		System.out.println(code);
		
		if (mobile1.hashCode()==mobile.hashCode()) {
			mobile1.equals(mobile1);
				
		}
		else {
			System.out.println("it is not equals");
		}
		


	}

}
