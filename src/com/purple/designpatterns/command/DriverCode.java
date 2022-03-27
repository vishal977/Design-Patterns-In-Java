package com.purple.designpatterns.command;

public class DriverCode {

	public static void main(String[] args) {
		LightBulb garageLight = new LightBulb("Garage light");
		LightBulb studyLight = new LightBulb("Study light");
		
		TurnLightOn turnLightOn = new TurnLightOn(garageLight);
		turnLightOn.executeCommand();
		turnLightOn.undoCommand();
		turnLightOn = new TurnLightOn(studyLight);
		turnLightOn.executeCommand();
		
		TurnLightOff turnLightOff = new TurnLightOff(garageLight);
		turnLightOff.executeCommand();
		turnLightOff = new TurnLightOff(studyLight);
		turnLightOff.executeCommand();
	}

}
