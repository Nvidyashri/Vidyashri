package com.xworkz.dto4.main;

import com.xworkz.dto4.EclipsDTO;


public class EclipsElite {

	public static void main(String[] args) {
		
		EclipsDTO eclips=new EclipsDTO();
		eclips.getClassCreation();
		eclips.getConsole();
		eclips.getHelp();
		eclips.getMinimize();
		eclips.getName();
		eclips.getNavigation();
		eclips.getOpenTask();
		eclips.getPackageExploror();
		eclips.getPackagrCreation();
		eclips.getRefactor();
		eclips.getRefactor();
		eclips.getRemove();
		eclips.getReStore();
		eclips.getSetting();
		eclips.getSource();
		eclips.getTaskList();
		eclips.setDebugOption("debugoption");
		System.out.println(eclips.isDebugOption());
		eclips.setEditeOption("edite option");
		System.out.println(eclips.isEditeOption());
		
		EclipsDTO eclips1=new EclipsDTO();
		eclips1.getClassCreation();
		eclips1.getConsole();
		eclips1.getHelp();
		eclips1.getMinimize();
		eclips1.getName();
		eclips1.getNavigation();
		eclips1.getOpenTask();
		eclips1.getPackageExploror();
		eclips1.getPackagrCreation();
		eclips1.getRefactor();
		eclips1.getRefactor();
		eclips1.getRemove();
		eclips1.getReStore();
		eclips1.getSetting();
		eclips1.getSource();
		eclips1.getTaskList();
		eclips1.setDebugOption("debugoption");
		System.out.println(eclips1.isDebugOption());
		eclips1.setEditeOption("edite option");
		System.out.println(eclips1.isEditeOption());
		
		int code=eclips1.hashCode();
		System.out.println(code);
		
		if (eclips1.hashCode()==eclips.hashCode()) {
			eclips.equals(eclips1);
				
		}
		else {
			System.out.println("it is not equals");
		}

	}

}
