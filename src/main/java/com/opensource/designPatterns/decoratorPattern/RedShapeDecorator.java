package com.opensource.designPatterns.decoratorPattern;

import com.opensource.DesignPatterns.factoryPattern.Shape;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shapeDecorator) {
		super(shapeDecorator);
	}
	@Override
	public void draw(){
		shapeDecorator.draw();
		colorRed();
	}
	
	public void colorRed(){
		System.out.println("Coloring circle with red");
	}
	
}
