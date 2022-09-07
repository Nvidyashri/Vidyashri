package com.xworkz.implementr;

import com.xworkz.javadao.dao.StatesDAO;

public class StateDAOImplementr implements StatesDAO{
	
	private String[] stateNames = new String[20];
	
    @Override
   public boolean save(String StateNames) {
   	 for(int i=0;i < stateNames.length; i++) {
   		 if(stateNames[i]==null) {
   			 stateNames[i]=StateNames;
   			 break;
   			 
   			 
   		 }
   	 }
   	return false;
   }
    @Override
   public void printlnAllStates() {
   	 for(int i=0; i<stateNames.length; i++) {
   		 System.out.println(stateNames[i]);
   	 }
   	
   }
	
	

}
