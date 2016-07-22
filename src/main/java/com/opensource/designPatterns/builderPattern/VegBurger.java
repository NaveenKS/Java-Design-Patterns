package com.opensource.designPatterns.builderPattern;

public class VegBurger extends Burger{
	private static final String name = "Veg Burger";
	@Override
	public String name() {
		return name;
	}

	@Override
	public float price() {
		return 50.2f;
	}
	
}
