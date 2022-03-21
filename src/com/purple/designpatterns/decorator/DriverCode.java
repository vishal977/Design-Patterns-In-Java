package com.purple.designpatterns.decorator;

public class DriverCode {

	public static void main(String[] args) {
		System.out.println("Creating a Plain Milkshake with ice cream scoop add on.");
		IceCreamScoopAddOn plainMilkShakeWithIceCreamScoop = new IceCreamScoopAddOn(new PlainMilkShake());
		System.out.println(plainMilkShakeWithIceCreamScoop.getDescription());
		System.out.println(plainMilkShakeWithIceCreamScoop.getPrice());
		
		System.out.println("Creating a Thickshake with Choco stick add on.");
		ChocoStickAddOn thickShakeWithChocoStickAddOn = new ChocoStickAddOn(new ThickShake());
		System.out.println(thickShakeWithChocoStickAddOn.getDescription());
		System.out.println(thickShakeWithChocoStickAddOn.getPrice());
		
		System.out.println("Creating a Thickshake with both add ons.");
		IceCreamScoopAddOn thichkShakeWithAllAddons = new IceCreamScoopAddOn(new ChocoStickAddOn(new ThickShake()));
		System.out.println(thichkShakeWithAllAddons.getDescription());
		System.out.println(thichkShakeWithAllAddons.getPrice());
	}

}
