package com.opensource.designPatterns.builderPattern;

public abstract class CoolDrinks implements Item{

	public abstract String name();

	public abstract float price();
	
	public Packaging pack() {
		return new Bottle();
	}

}	
