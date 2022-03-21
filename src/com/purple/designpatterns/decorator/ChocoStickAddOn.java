package com.purple.designpatterns.decorator;

public class ChocoStickAddOn extends MilkShakeAddonsDecorator {

	private MilkShake milkShake;
	
	public ChocoStickAddOn(MilkShake milkShake) {
		this.milkShake = milkShake;
	}
	
	@Override
	public double getPrice() {
		return milkShake.getPrice() + 15.20;
	}
	
	@Override
	public String getDescription() {
		return milkShake.getDescription().concat(" with a choco stick");
	}

}
