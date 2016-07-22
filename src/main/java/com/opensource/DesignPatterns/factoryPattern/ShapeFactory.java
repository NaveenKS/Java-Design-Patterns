package com.opensource.DesignPatterns.factoryPattern;

public class ShapeFactory {
	public Shape getShape(ShapeType shapeType){
		if(shapeType.equals(ShapeType.Circle)){
			return new Circle();
		}else if(shapeType.equals(ShapeType.Square)){
			return new Square();
		}else{
			return null;
		}
	}
}
