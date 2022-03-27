package com.purple.designpatterns.command;

public class TurnLightOff implements GenericCommand {

	private LightBulb lightBulb;

	public TurnLightOff(LightBulb lightBulb) {
		this.lightBulb = lightBulb;
	}

	@Override
	public void executeCommand() {
		lightBulb.off();
	}

	@Override
	public void undoCommand() {
		lightBulb.off();
	}

}
