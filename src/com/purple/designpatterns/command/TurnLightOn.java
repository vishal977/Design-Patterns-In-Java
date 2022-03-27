package com.purple.designpatterns.command;

public class TurnLightOn implements GenericCommand {
	
	private LightBulb lightBulb;
	
	public TurnLightOn(LightBulb lightBulb) {
		this.lightBulb = lightBulb;
	}
	
	@Override
	public void executeCommand() {
		lightBulb.on();
	}

	@Override
	public void undoCommand() {
		lightBulb.off();
	}

}
