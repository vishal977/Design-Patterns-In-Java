package com.purple.designpatterns.decorator;

public class IceCreamScoopAddOn extends MilkShakeAddonsDecorator {

	private MilkShake milkShake;
	
	public IceCreamScoopAddOn(MilkShake milkShake) {
		this.milkShake = milkShake;
	}
	
	@Override
	public double getPrice() {
		return milkShake.getPrice() + 20.50;
	}

	@Override
	public String getDescription() {
		return milkShake.getDescription().concat(" with an Ice cream scoop");
	}

}
