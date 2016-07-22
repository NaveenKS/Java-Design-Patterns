package com.opensource.designPatterns.abstractFactoryPattern;

import com.opensource.DesignPatterns.factoryPattern.Shape;
import com.opensource.DesignPatterns.factoryPattern.ShapeType;

public abstract class AbstraceFactory {
	public abstract Color getColorFactory(ColorType colorType);
	public abstract Shape getShapeFactory(ShapeType shapeType);
}
