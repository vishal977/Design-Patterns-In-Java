package com.purple.designpatterns.command;

public class DriverCode {

	public static void main(String[] args) {
		LightBulb garageLight = new LightBulb("Garage light");
		LightBulb studyLight = new LightBulb("Study light");
		
		LightSwitch garageLightSwitch = new LightSwitch(new TurnLightOff(garageLight), new TurnLightOn(garageLight));
		LightSwitch studyLightSwitch = new LightSwitch(new TurnLightOff(studyLight), new TurnLightOn(studyLight));
		
		garageLightSwitch.switchUp();
		garageLightSwitch.switchDown();
		
		studyLightSwitch.switchUp();
		studyLightSwitch.switchDown();
	}

}
