package com.xworkz.javadao;

import com.xworkz.javadao.implementr.LakeDaoImolementr;

public class LakeElite {

	public static void main(String[] args) {
		
		LakeDaoImolementr implementr = new LakeDaoImolementr();
		implementr.save("Ganga");
		implementr.save("yamuna");
		implementr.save("kaveri");
		implementr.save("godavari");
		implementr.save("tungabadhra");
		implementr.save("sindhu");
		implementr.save("Brahmaputra");
		implementr.save("Krishna");
		implementr.save("Tapi");
		implementr.save("Meghna");
		
		implementr.printlnAllLakes();

	}

}
