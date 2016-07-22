package com.opensource.designPatterns.builderPattern;

public class MealPreparation {
	public Meal prepareVegMeal(){
		Item burger = new VegBurger();
		Item coke = new Coke();
		Meal meal = new Meal();
		meal.addItem(burger);
		meal.addItem(coke);
		return meal;
	}
	// Same way for non veg meal
	public Meal prepareNonVegMeal(){
		return null;
	}
}
