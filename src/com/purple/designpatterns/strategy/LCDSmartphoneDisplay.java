package com.purple.designpatterns.strategy;

public class LCDSmartphoneDisplay implements SmartphoneDisplay {

	@Override
	public void getRefreshRate() {
		System.out.println("Refresh rate - 60Hz");
	}

	@Override
	public void getBrightness() {
		System.out.println("Brightness - 1000 nits");
	}
	
}
