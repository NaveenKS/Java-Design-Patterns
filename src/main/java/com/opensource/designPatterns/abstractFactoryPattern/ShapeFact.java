package com.opensource.designPatterns.abstractFactoryPattern;

import com.opensource.DesignPatterns.factoryPattern.Circle;
import com.opensource.DesignPatterns.factoryPattern.Shape;
import com.opensource.DesignPatterns.factoryPattern.ShapeType;
import com.opensource.DesignPatterns.factoryPattern.Square;

public class ShapeFact extends AbstraceFactory{

	@Override
	public Color getColorFactory(ColorType colorType) {
		return null;
	}

	@Override
	public Shape getShapeFactory(ShapeType shapeType) {
		if(shapeType.equals(ShapeType.Circle)){
			return new Circle();
		}else if(shapeType.equals(ShapeType.Square)){
			return new Square();
		}else{
			return null;
		}
	}
	
}
