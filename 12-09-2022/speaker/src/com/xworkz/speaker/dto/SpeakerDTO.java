package com.xworkz.speaker.dto;

import java.io.Serializable;
import java.util.Arrays;

public class SpeakerDTO implements Serializable {
	
	private String brandName;
	private String type;
	private boolean magnet;
	private boolean graphene;
	private double batteryLast;
	private boolean wireconnection;
	private boolean bluetoothConnection;
	private boolean highreSolutions;
	private String[] headphonesbuilt;
	private double headPhonesCost;
	private String[] batteryType;
	private int bluetoothVersion;
	private double warranty;
	private double soundQuality;
	private String preferredProvider;
	
	public SpeakerDTO() {
		
	}

	@Override
	public String toString() {
		return "SpeakerDTO [brandName=" + brandName + ", type=" + type + ", magnet=" + magnet + ", graphene=" + graphene
				+ ", batteryLast=" + batteryLast + ", wireconnection=" + wireconnection + ", bluetoothConnection="
				+ bluetoothConnection + ", highreSolutions=" + highreSolutions + ", headphonesbuilt="
				+ Arrays.toString(headphonesbuilt) + ", headPhonesCost=" + headPhonesCost + ", batteryType="
				+ Arrays.toString(batteryType) + ", bluetoothVersion=" + bluetoothVersion + ", warranty=" + warranty
				+ ", soundQuality=" + soundQuality + ", preferredProvider=" + preferredProvider + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isMagnet() {
		return magnet;
	}

	public void setMagnet(boolean magnet) {
		this.magnet = magnet;
	}

	public boolean isGraphene() {
		return graphene;
	}

	public void setGraphene(boolean graphene) {
		this.graphene = graphene;
	}

	public double getBatteryLast() {
		return batteryLast;
	}

	public void setBatteryLast(double batteryLast) {
		this.batteryLast = batteryLast;
	}

	public boolean isWireconnection() {
		return wireconnection;
	}

	public void setWireconnection(boolean wireconnection) {
		this.wireconnection = wireconnection;
	}

	public boolean isBluetoothConnection() {
		return bluetoothConnection;
	}

	public void setBluetoothConnection(boolean bluetoothConnection) {
		this.bluetoothConnection = bluetoothConnection;
	}

	public boolean isHighreSolutions() {
		return highreSolutions;
	}

	public void setHighreSolutions(boolean highreSolutions) {
		this.highreSolutions = highreSolutions;
	}

	public String[] getHeadphonesbuilt() {
		return headphonesbuilt;
	}

	public void setHeadphonesbuilt(String[] headphonesbuilt) {
		this.headphonesbuilt = headphonesbuilt;
	}

	public double getHeadPhonesCost() {
		return headPhonesCost;
	}

	public void setHeadPhonesCost(double headPhonesCost) {
		this.headPhonesCost = headPhonesCost;
	}

	public String[] getBatteryType() {
		return batteryType;
	}

	public void setBatteryType(String[] batteryType) {
		this.batteryType = batteryType;
	}

	public int getBluetoothVersion() {
		return bluetoothVersion;
	}

	public void setBluetoothVersion(int bluetoothVersion) {
		this.bluetoothVersion = bluetoothVersion;
	}

	public double getWarranty() {
		return warranty;
	}

	public void setWarranty(double warranty) {
		this.warranty = warranty;
	}

	public double getSoundQuality() {
		return soundQuality;
	}

	public void setSoundQuality(double soundQuality) {
		this.soundQuality = soundQuality;
	}

	public String getPreferredProvider() {
		return preferredProvider;
	}

	public void setPreferredProvider(String preferredProvider) {
		this.preferredProvider = preferredProvider;
	}
	
	
	
	

}
