package com.xworkz.dto6;

public class MobileDTO {

	private String name;
	private String type;
	private String brand;
	private int price;
	private int ram;
	private String storage;
	private String battery;
	private String wifi;
	private String dataConnection;
	private String touchScreen;
	private int totalNoOfApps;
	private String wirelessOperation;
	private int rom;
	private int internalMemory;
	private String camera;
	private int frontCamFixel;
	private int intbackCameraFixel;
	private boolean fullScreen;
	private int size;
	private int varrenty;
	
	@Override
	public int hashCode() {
		return 10000;
	}
	@Override
	public boolean equals(Object obj) {
		
		if (obj != null ) {
			System.out.println("it is not equal");
			if(obj instanceof MobileDTO) {
				System.out.println("it is a instanceof College");
				MobileDTO converted=(MobileDTO) obj;//casting
				 if(converted.name.equals(this.name)&& converted.type.equals(this.type)) {
					  System.out.println("collegeName and location are equal");
				
			}
				 else {
					 System.out.println("collegeName and location are not equal");
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getDataConnection() {
		return dataConnection;
	}
	public void setDataConnection(String dataConnection) {
		this.dataConnection = dataConnection;
	}
	public String getTouchScreen() {
		return touchScreen;
	}
	public void setTouchScreen(String touchScreen) {
		this.touchScreen = touchScreen;
	}
	public int getTotalNoOfApps() {
		return totalNoOfApps;
	}
	public void setTotalNoOfApps(int totalNoOfApps) {
		this.totalNoOfApps = totalNoOfApps;
	}
	public String getWirelessOperation() {
		return wirelessOperation;
	}
	public void setWirelessOperation(String wirelessOperation) {
		this.wirelessOperation = wirelessOperation;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public int getInternalMemory() {
		return internalMemory;
	}
	public void setInternalMemory(int internalMemory) {
		this.internalMemory = internalMemory;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	public int getFrontCamFixel() {
		return frontCamFixel;
	}
	public void setFrontCamFixel(int frontCamFixel) {
		this.frontCamFixel = frontCamFixel;
	}
	public int getIntbackCameraFixel() {
		return intbackCameraFixel;
	}
	public void setIntbackCameraFixel(int intbackCameraFixel) {
		this.intbackCameraFixel = intbackCameraFixel;
	}
	public boolean isFullScreen() {
		return fullScreen;
	}
	public void setFullScreen(boolean fullScreen) {
		this.fullScreen = fullScreen;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getVarrenty() {
		return varrenty;
	}
	public void setVarrenty(int varrenty) {
		this.varrenty = varrenty;
	}
	
	
	
	
}
