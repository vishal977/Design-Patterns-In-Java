package com.purple.designpatterns.strategy;

public class LTPOSmartphoneDisplay implements SmartphoneDisplay {

	@Override
	public void getRefreshRate() {
		System.out.println("Refresh rate - Variable from 1Hz to 120Hz");
	}

	@Override
	public void getBrightness() {
		System.out.println("Brightness - 1700 nits");
	}

}
