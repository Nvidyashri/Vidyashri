package com.xworkz.collection;

import java.util.ArrayList;
import java.util.List;



public class CollectionElite {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		System.out.println(list);
		
		System.out.println(list.indexOf(list));
		System.out.println(list.lastIndexOf(list));
		System.out.println(list.addAll(list));
		System.out.println(list.contains(list));
		System.out.println(list.containsAll(list));
		System.out.println(list.equals(list));

	}

}
