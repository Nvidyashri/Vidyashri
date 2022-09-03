package com.xworkz.dto3;


public class TextileDTO {
	
	private String name;
	private String place;
	private String type;
	private String elasticity;
	private String density;
	private String flexibility;
	private String uniformity;
	private String elongation;
	private String lustre;
	private String fineness;
	private String colour;
	private String tensileStrength;
	private String thermalConductivity;
	private String cohesiveness;
	private double length;
	private String dimensionalStability;
	private String durability;
	private String physicalCharecterstic;
	private String toughness;
	private String chemicalReaction;
	private String friction;
	private String softness;
	private String abrasionResistance;
	private double ratio;
	private double meltingPoint;
	private boolean crossSection;
	
	@Override
	public int hashCode() {
		return 12;
	}
	@Override
	public boolean equals(Object obj) {
		
		if (obj != null ) {
			System.out.println("it is not equal");
			if(obj instanceof TextileDTO) {
				System.out.println("it is a instanceof textile");
				TextileDTO converted=(TextileDTO) obj;//casting
				 if(converted.name.equals(this.name)&& converted.type.equals(this.type)) {
					  System.out.println("name and type are equal");
				
			}
				 else {
					 System.out.println("name and type are not equal");
				 }
		}
			else {
				System.out.println("both are equal");
			}
		}
		return super.equals(obj);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getElasticity() {
		return elasticity;
	}
	public void setElasticity(String elasticity) {
		this.elasticity = elasticity;
	}
	public String getDensity() {
		return density;
	}
	public void setDensity(String density) {
		this.density = density;
	}
	public String getFlexibility() {
		return flexibility;
	}
	public void setFlexibility(String flexibility) {
		this.flexibility = flexibility;
	}
	public String getUniformity() {
		return uniformity;
	}
	public void setUniformity(String uniformity) {
		this.uniformity = uniformity;
	}
	public String getElongation() {
		return elongation;
	}
	public void setElongation(String elongation) {
		this.elongation = elongation;
	}
	public String getLustre() {
		return lustre;
	}
	public void setLustre(String lustre) {
		this.lustre = lustre;
	}
	public String getFineness() {
		return fineness;
	}
	public void setFineness(String fineness) {
		this.fineness = fineness;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getTensileStrength() {
		return tensileStrength;
	}
	public void setTensileStrength(String tensileStrength) {
		this.tensileStrength = tensileStrength;
	}
	public String getThermalConductivity() {
		return thermalConductivity;
	}
	public void setThermalConductivity(String thermalConductivity) {
		this.thermalConductivity = thermalConductivity;
	}
	public String getCohesiveness() {
		return cohesiveness;
	}
	public void setCohesiveness(String cohesiveness) {
		this.cohesiveness = cohesiveness;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getDimensionalStability() {
		return dimensionalStability;
	}
	public void setDimensionalStability(String dimensionalStability) {
		this.dimensionalStability = dimensionalStability;
	}
	public String getDurability() {
		return durability;
	}
	public void setDurability(String durability) {
		this.durability = durability;
	}
	public String getPhysicalCharecterstic() {
		return physicalCharecterstic;
	}
	public void setPhysicalCharecterstic(String physicalCharecterstic) {
		this.physicalCharecterstic = physicalCharecterstic;
	}
	public String getToughness() {
		return toughness;
	}
	public void setToughness(String toughness) {
		this.toughness = toughness;
	}
	public String getChemicalReaction() {
		return chemicalReaction;
	}
	public void setChemicalReaction(String chemicalReaction) {
		this.chemicalReaction = chemicalReaction;
	}
	public String getFriction() {
		return friction;
	}
	public void setFriction(String friction) {
		this.friction = friction;
	}
	public String getSoftness() {
		return softness;
	}
	public void setSoftness(String softness) {
		this.softness = softness;
	}
	public String getAbrasionResistance() {
		return abrasionResistance;
	}
	public void setAbrasionResistance(String abrasionResistance) {
		this.abrasionResistance = abrasionResistance;
	}
	public double getRatio() {
		return ratio;
	}
	public void setRatio(double ratio) {
		this.ratio = ratio;
	}
	public double getMeltingPoint() {
		return meltingPoint;
	}
	public void setMeltingPoint(double meltingPoint) {
		this.meltingPoint = meltingPoint;
	}
	public boolean isCrossSection() {
		return crossSection;
	}
	public void setCrossSection(boolean crossSection) {
		this.crossSection = crossSection;
	}

}
