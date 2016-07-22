package com.opensource.designPatterns.abstractFactoryPattern;

public class FactoryProducer {
	public static AbstraceFactory getFactory(String factory){
		if(factory.equals("SHAPE")){
			return new ShapeFact();
		}else if(factory.equals("COLOR")){
			return new Colorfact();
		}else{
			return null;
		}
	}
}
