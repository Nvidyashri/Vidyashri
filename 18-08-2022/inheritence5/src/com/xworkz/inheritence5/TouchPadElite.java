package com.xworkz.inheritence5;

public class TouchPadElite {

	public static void main(String[] args) {
		TouchPad touchpad = new TouchPad("lenovo", true, "window10");
		touchpad.torisu();

		KeyBoard keyboard = new TouchPad("hp", false, "window10");
		TouchPad converted = (TouchPad) keyboard;
		converted.price = 2547;
		converted.color = "black";
		converted.noOfKeys = 104;
		converted.torisu();

	

	}

}
