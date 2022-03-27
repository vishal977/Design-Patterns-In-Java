package com.purple.designpatterns.command;

//Imagine this as a generic switch that has two positions - UP and DOWN.
public class LightSwitch {
	
	GenericCommand positionUp;
	
	GenericCommand positionDown;
	
	public LightSwitch(GenericCommand positionUp, GenericCommand positionDown) {
		this.positionUp = positionUp;
		this.positionDown = positionDown;
	}
	
	public void switchUp() {
		positionUp.executeCommand();
	}
	
	public void switchDown() {
		positionDown.executeCommand();
	}

}
