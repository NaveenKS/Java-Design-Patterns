package com.opensource.designPatterns.decoratorPattern;

import com.opensource.DesignPatterns.factoryPattern.Shape;

public class ShapeDecorator implements Shape{
	public Shape shapeDecorator;
	
	public ShapeDecorator(Shape shapeDecorator) {
		this.shapeDecorator = shapeDecorator;
	}
	
	public void draw() {
		shapeDecorator.draw();
	}

}
