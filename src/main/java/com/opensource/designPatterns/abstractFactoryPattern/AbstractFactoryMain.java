package com.opensource.designPatterns.abstractFactoryPattern;

import com.opensource.DesignPatterns.factoryPattern.Shape;
import com.opensource.DesignPatterns.factoryPattern.ShapeType;

public class AbstractFactoryMain {
	public static void main(String[] args){
		AbstraceFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		Shape circle = shapeFactory.getShapeFactory(ShapeType.Circle);
		circle.draw();
	}
}
