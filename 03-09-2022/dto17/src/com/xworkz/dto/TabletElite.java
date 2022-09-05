package com.xworkz.dto;

public class TabletElite {

	public static void main(String[] args) {

		TabletDTO medicine = new TabletDTO();
		medicine.setFounder("Hoffmann La Roche");
		medicine.setSpecialist("Neurologist");
		medicine.setSince(1966);
		medicine.setPurposeOf("Headech Pain");
		medicine.setTreated("Pain Relax");
		medicine.setCompany("Worl Helth Oragansation");
		medicine.setTabletName("Saridon");
		medicine.setContent("Paracetamol");
		medicine.setMrp(58.0);
		medicine.setSaleCost(41.1);
		medicine.setFounder1("Hoffmann La Roche");
		medicine.setSpecialist1("Neurologist");
		medicine.setSince1(1966);
		medicine.setPurposeOf1("Headech Pain");
		medicine.setTreated1("Pain Relax");
		medicine.setCompany1("Worl Helth Oragansation");
		medicine.setTabletName1("Saridon");
		medicine.setContent1("Paracetamol");
		medicine.setMrp1(58.0);
		medicine.setSaleCost1(41.1);
		medicine.setFounder2("");
		medicine.setSpecialist2("");
		medicine.setSince2(null);
		medicine.setPurposeOf2("");
		medicine.setTreated2("");
		medicine.setCompany2("");
		medicine.setTabletName2("");
		medicine.setContent2("");
		medicine.setMrp2(null);
		medicine.setSaleCost2(null);
		medicine.setFounder3("");
		medicine.setSpecialist3("");
		medicine.setSince3(null);
		medicine.setPurposeOf3("");
		medicine.setTreated3("");
		medicine.setCompany3("");
		medicine.setTabletName3("");
		medicine.setContent3("");
		medicine.setMrp3(null);
		medicine.setSaleCost3(null);
		int med = medicine.hashCode();
		System.out.println(med);

		TabletDTO medicine1 = new TabletDTO();
		medicine1.setFounder("Hoffmann La Roche");
		medicine1.setSpecialist("Neurologist");
		medicine1.setSince(1966);
		medicine1.setPurposeOf("Headech Pain");
		medicine1.setTreated("Pain Relax");
		medicine1.setCompany("Worl Helth Oragansation");
		medicine1.setTabletName("Saridon");
		medicine1.setContent("Paracetamol");
		medicine1.setMrp(58.0);
		medicine1.setSaleCost(41.1);
		medicine1.setFounder1("Hoffmann La Roche");
		medicine1.setSpecialist1("Neurologist");
		medicine1.setSince1(1966);
		medicine1.setPurposeOf1("Headech Pain");
		medicine1.setTreated1("Pain Relax");
		medicine1.setCompany1("Worl Helth Oragansation");
		medicine1.setTabletName1("Saridon");
		medicine1.setContent1("Paracetamol");
		medicine1.setMrp1(58.0);
		medicine1.setSaleCost1(41.1);
		medicine1.setFounder2("aspire");
		medicine1.setSpecialist2("Surgery");
		medicine1.setSince2(1988);
		medicine1.setPurposeOf2("Fevour");
		medicine1.setTreated2(" salicylates,");
		medicine1.setCompany2("Aspiri");
		medicine1.setTabletName2("aspirin");
		medicine1.setContent2("platelet aggregation inhibitors");
		medicine1.setMrp2(5.0);
		medicine1.setSaleCost2(2.0);
		medicine1.setFounder3("acetaminophen");
		medicine1.setSpecialist3("OPd");
		medicine1.setSince3(1945);
		medicine1.setPurposeOf3("Headech");
		medicine1.setTreated3("Fevour Headech");
		medicine1.setCompany3("Bayer Aspirin");
		medicine1.setTabletName3("Paracetamol");
		medicine1.setContent3("salicylates,");
		medicine1.setMrp3(38.4);
		medicine1.setSaleCost3(22.0);
		System.out.println(medicine1.hashCode());

		medicine.equals(medicine1);
	}

}
