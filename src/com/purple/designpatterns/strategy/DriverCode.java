package com.purple.designpatterns.strategy;

public class DriverCode {

	public static void main(String[] args) {
		Smartphone micromaxCanvas6 = new Smartphone("Micromax", "Canvas 6", new LCDSmartphoneDisplay());
		Smartphone oneplus5T = new Smartphone("Oneplus", "5T", new AMOLEDSmartphoneDisplay());
		Smartphone samsungS22Ultra = new Smartphone("Samsung", "S22 Ultra", new LTPOSmartphoneDisplay());
		
		micromaxCanvas6.getPhoneName();
		micromaxCanvas6.getDisplay().getBrightness();
		micromaxCanvas6.getDisplay().getRefreshRate();
		
		oneplus5T.getPhoneName();
		oneplus5T.getDisplay().getBrightness();
		oneplus5T.getDisplay().getRefreshRate();
		
		samsungS22Ultra.getPhoneName();
		samsungS22Ultra.getDisplay().getBrightness();
		samsungS22Ultra.getDisplay().getRefreshRate();
		
	}

}
