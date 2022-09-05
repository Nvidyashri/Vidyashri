package com.xworkz.dto;

public class BarElite {

	public static void main(String[] args) {

			BarDTO dto = new BarDTO();
			dto.setDoorColor("Grey");
			dto.setBeerPrice(1000.00D);

			BarDTO dto1 = new BarDTO();
			dto1.setDoorColor("Yellow");
			dto1.setBeerPrice(2000.00D);

			System.out.println(dto.hashCode());
			System.out.println(dto.hashCode());

			System.out.println(System.identityHashCode(dto));
			System.out.println(System.identityHashCode(dto1));

			if (dto.hashCode() == dto.hashCode()) {
				Boolean b = dto.equals(dto1);
				System.out.println(b);
			} else {
				System.out.println("not equal");
			}
	}

}
