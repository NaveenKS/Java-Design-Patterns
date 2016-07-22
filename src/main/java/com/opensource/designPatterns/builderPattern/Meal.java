package com.opensource.designPatterns.builderPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Meal {
	List<Item> items;
	public Meal(){
		items = (List<Item>) new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		items.add(item);
	}
	
	public float calPrice(){
		float price = 0;
		for(Item item : items){
			price = price + item.price();
		}
		return price;
	}
	
	public void printItems(){
		System.out.println("-----Printing Items----");
	}
}
