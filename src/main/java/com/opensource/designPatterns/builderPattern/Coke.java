package com.opensource.designPatterns.builderPattern;

public class Coke extends CoolDrinks{
	public static final String name = "coke";
	@Override
	public String name() {
		return name;
	}

	@Override
	public float price() {
		return 10;
	}

}
