package com.xworkz.dto9.main;

import com.xworkz.dto9.BasketBallDTO;

   public class BasketBallElite {

	public static void main(String[] args) {

      BasketBallDTO ball = new BasketBallDTO();
		
		ball.setUmpire("divya");
		ball.setReferee("ajay");
		
		BasketBallDTO ball2 = new BasketBallDTO();
		ball2.setUmpire("vishal");
		ball2.setReferee("krishna");
		
		int code=ball2.hashCode();
		System.out.println(code);
		
		if (ball.hashCode() == ball2.hashCode()) {
			ball2.equals(ball);
		}
		else {
			System.out.println("it is not equal");
		}

	
		
		
		
	
		

	}

}
