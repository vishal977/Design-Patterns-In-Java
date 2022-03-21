package com.purple.designpatterns.decorator;

public class PlainMilkShake extends MilkShake {

	@Override
	public double getPrice() {
		return 160.00;
	}

	@Override
	public String getDescription() {
		return "A plain milkshake";
	}

}
