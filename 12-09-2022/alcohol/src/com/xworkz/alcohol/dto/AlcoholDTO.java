package com.xworkz.alcohol.dto;



public class AlcoholDTO{
	
	private double ph;
	private double boilingPoint; //69
	private double meltingPoint;
	private double density;
	private String taste;
	private String nature;
	private String group;
	private double molecularWeiht;
	private boolean solubilityInWater;
	private int noOfCarbon;
	private boolean flameable;
	private String hazardous;
	private double toxicRange;
	private double vapourPressure;
	private String conjugateAcide;
	private String conjugateBase;
	
	public AlcoholDTO(){
		
		
	}

	@Override
	public String toString() {
		return "AlcoholDTO [ph=" + ph + ", boilingPoint=" + boilingPoint + ", meltingPoint=" + meltingPoint
				+ ", density=" + density + ", taste=" + taste + ", nature=" + nature + ", group=" + group
				+ ", molecularWeiht=" + molecularWeiht + ", solubilityInWater=" + solubilityInWater + ", noOfCarbon="
				+ noOfCarbon + ", flameable=" + flameable + ", hazardous=" + hazardous + ", toxicRange=" + toxicRange
				+ ", vapourPressure=" + vapourPressure + ", conjugateAcide=" + conjugateAcide + ", conjugateBase="
				+ conjugateBase + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public double getPh() {
		return ph;
	}

	public void setPh(double ph) {
		this.ph = ph;
	}

	public double getBoilingPoint() {
		return boilingPoint;
	}

	public void setBoilingPoint(double boilingPoint) {
		this.boilingPoint = boilingPoint;
	}

	public double getMeltingPoint() {
		return meltingPoint;
	}

	public void setMeltingPoint(double meltingPoint) {
		this.meltingPoint = meltingPoint;
	}

	public double getDensity() {
		return density;
	}

	public void setDensity(double density) {
		this.density = density;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public double getMolecularWeiht() {
		return molecularWeiht;
	}

	public void setMolecularWeiht(double molecularWeiht) {
		this.molecularWeiht = molecularWeiht;
	}

	public boolean isSolubilityInWater() {
		return solubilityInWater;
	}

	public void setSolubilityInWater(boolean solubilityInWater) {
		this.solubilityInWater = solubilityInWater;
	}

	public int getNoOfCarbon() {
		return noOfCarbon;
	}

	public void setNoOfCarbon(int noOfCarbon) {
		this.noOfCarbon = noOfCarbon;
	}

	public boolean isFlameable() {
		return flameable;
	}

	public void setFlameable(boolean flameable) {
		this.flameable = flameable;
	}

	public String getHazardous() {
		return hazardous;
	}

	public void setHazardous(String hazardous) {
		this.hazardous = hazardous;
	}

	public double getToxicRange() {
		return toxicRange;
	}

	public void setToxicRange(double toxicRange) {
		this.toxicRange = toxicRange;
	}

	public double getVapourPressure() {
		return vapourPressure;
	}

	public void setVapourPressure(double vapourPressure) {
		this.vapourPressure = vapourPressure;
	}

	public String getConjugateAcide() {
		return conjugateAcide;
	}

	public void setConjugateAcide(String conjugateAcide) {
		this.conjugateAcide = conjugateAcide;
	}

	public String getConjugateBase() {
		return conjugateBase;
	}

	public void setConjugateBase(String conjugateBase) {
		this.conjugateBase = conjugateBase;
	}
	
	

}
