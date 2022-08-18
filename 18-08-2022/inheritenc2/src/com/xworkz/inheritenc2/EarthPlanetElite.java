package com.xworkz.inheritenc2;

public class EarthPlanetElite {

	public static void main(String[] args) {

			
			EarthPlanet earth=new EarthPlanet(8,true,true);
			earth.torisu();
			
			Planet planet=new EarthPlanet(8,true,true);
			EarthPlanet converted=(EarthPlanet)planet;
			
			converted.planetName="neptune";
			converted.planetRadius=24622;
			converted.shapeOfPlanet="oval";
			converted.torisu();
			
		}

}

	


