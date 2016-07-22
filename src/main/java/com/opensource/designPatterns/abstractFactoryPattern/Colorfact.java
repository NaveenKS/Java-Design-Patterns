package com.opensource.designPatterns.abstractFactoryPattern;

import com.opensource.DesignPatterns.factoryPattern.Shape;
import com.opensource.DesignPatterns.factoryPattern.ShapeType;

public class Colorfact extends AbstraceFactory{
	
	@Override
	public Color getColorFactory(ColorType colorType) {
		if(colorType.equals(ColorType.Red)){
			return new Red();
		}else if(colorType.equals(ColorType.Green)){
			return new Green();
		}else{
			return null;
		}
	}

	@Override
	public Shape getShapeFactory(ShapeType shapeType) {
		return null;
	}
}
