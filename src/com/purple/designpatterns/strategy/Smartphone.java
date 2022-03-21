package com.purple.designpatterns.strategy;

public class Smartphone {
	
	public String manufacturer;
	
	public String modelName;
	
	public SmartphoneDisplay display;

	public Smartphone(String manufacturer, String modelName, SmartphoneDisplay display) {
		super();
		this.manufacturer = manufacturer;
		this.modelName = modelName;
		this.display = display;
	}

	public Smartphone(SmartphoneDisplay display) {
		this.display = display;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public SmartphoneDisplay getDisplay() {
		return display;
	}

	public void setDisplay(SmartphoneDisplay display) {
		this.display = display;
	}
	
	public void getPhoneName() {
		System.out.println(manufacturer + modelName); 
	}

}
