package com.opensource.DesignPatterns.factoryPattern;

public class MainShape {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape circle = factory.getShape(ShapeType.Circle);
		circle.draw();
	}
}
