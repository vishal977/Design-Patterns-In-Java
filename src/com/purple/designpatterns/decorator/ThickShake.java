package com.purple.designpatterns.decorator;

public class ThickShake extends MilkShake {

	@Override
	public double getPrice() {
		return 200.00;
	}

	@Override
	public String getDescription() {
		return "A thickshake";
	}

}
