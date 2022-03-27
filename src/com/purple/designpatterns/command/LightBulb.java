package com.purple.designpatterns.command;

public class LightBulb {
	
	private int lightStatus;
	
	public String label;
	
	public LightBulb(String label) {
		this.lightStatus = 0;
		this.label = label;
	}
	
	public int getLightStatus() {
		return lightStatus;
	}
	
	public void on() {
		this.lightStatus = 1;
		System.out.println(label + " switched on.");
	}
	
	public void off() {
		this.lightStatus = 0;
		System.out.println(label + " switched off.");
	}

}
