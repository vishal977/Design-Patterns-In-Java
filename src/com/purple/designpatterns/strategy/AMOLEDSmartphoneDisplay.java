package com.purple.designpatterns.strategy;

public class AMOLEDSmartphoneDisplay implements SmartphoneDisplay {

	@Override
	public void getRefreshRate() {
		System.out.println("Refresh rate - 120Hz");
	}

	@Override
	public void getBrightness() {
		System.out.println("Brightness - 1100 nits");
	}

}
