package com.opensource.designPatterns.builderPattern;

public class MainBuilder {
	public static void main(String[] args){
		MealPreparation mealPrepare = new MealPreparation();
		Meal meal = mealPrepare.prepareVegMeal();
		System.out.println(meal.calPrice());
	}
}
