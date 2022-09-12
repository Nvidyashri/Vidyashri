package com.xworkz.tablet.dto;

import java.io.Serializable;
import java.util.Arrays;

public class TabletDTO implements Serializable {
	
	private String brandName;
	private int mg;
	private String otherName;
	private String drugClass;
	private String tabletUsage;
	private String[] tabletContains;
	private String tabletAction;
	private boolean safeToUse;
	private String[] sideEffects;
	private double price;
	private String therapy;
	private int storedTemp;
	private String manufacture;
	private String medicineComposition;
	private boolean solublityInWater;
	
	public TabletDTO() {
		
	}

	@Override
	public String toString() {
		return "TabletDTO [brandName=" + brandName + ", mg=" + mg + ", otherName=" + otherName + ", drugClass="
				+ drugClass + ", tabletUsage=" + tabletUsage + ", tabletContains=" + Arrays.toString(tabletContains)
				+ ", tabletAction=" + tabletAction + ", safeToUse=" + safeToUse + ", sideEffects="
				+ Arrays.toString(sideEffects) + ", price=" + price + ", therapy=" + therapy + ", storedTemp="
				+ storedTemp + ", manufacture=" + manufacture + ", medicineComposition=" + medicineComposition
				+ ", solublityInWater=" + solublityInWater + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getMg() {
		return mg;
	}

	public void setMg(int mg) {
		this.mg = mg;
	}

	public String getOtherName() {
		return otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public String getDrugClass() {
		return drugClass;
	}

	public void setDrugClass(String drugClass) {
		this.drugClass = drugClass;
	}

	public String getTabletUsage() {
		return tabletUsage;
	}

	public void setTabletUsage(String tabletUsage) {
		this.tabletUsage = tabletUsage;
	}

	public String[] getTabletContains() {
		return tabletContains;
	}

	public void setTabletContains(String[] tabletContains) {
		this.tabletContains = tabletContains;
	}

	public String getTabletAction() {
		return tabletAction;
	}

	public void setTabletAction(String tabletAction) {
		this.tabletAction = tabletAction;
	}

	public boolean isSafeToUse() {
		return safeToUse;
	}

	public void setSafeToUse(boolean safeToUse) {
		this.safeToUse = safeToUse;
	}

	public String[] getSideEffects() {
		return sideEffects;
	}

	public void setSideEffects(String[] sideEffects) {
		this.sideEffects = sideEffects;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTherapy() {
		return therapy;
	}

	public void setTherapy(String therapy) {
		this.therapy = therapy;
	}

	public int getStoredTemp() {
		return storedTemp;
	}

	public void setStoredTemp(int storedTemp) {
		this.storedTemp = storedTemp;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getMedicineComposition() {
		return medicineComposition;
	}

	public void setMedicineComposition(String medicineComposition) {
		this.medicineComposition = medicineComposition;
	}

	public boolean isSolublityInWater() {
		return solublityInWater;
	}

	public void setSolublityInWater(boolean solublityInWater) {
		this.solublityInWater = solublityInWater;
	}
	
	
					
}


