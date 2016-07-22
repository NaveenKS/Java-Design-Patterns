package com.opensource.designPatterns.singletonPattern;

public class MainSingleton {
	public static void main(String[] args){
		SingleObject singleObject = SingleObject.getInstance();
		singleObject.printMessage();
	}
}
