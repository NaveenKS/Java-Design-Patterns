package com.opensource.designPatterns.decoratorPattern;

import com.opensource.DesignPatterns.factoryPattern.Circle;
import com.opensource.DesignPatterns.factoryPattern.Shape;

public class MainDecorator {
	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.draw();
		ShapeDecorator shapeDecorator = new RedShapeDecorator(circle);
		shapeDecorator.draw();
	}
}
