package com.opensource.designPatterns.builderPattern;

public abstract class Burger implements Item{

	public abstract String name() ;

	public abstract float price();
	
	public Packaging pack() {
		return new Wrapper();
	}

}
