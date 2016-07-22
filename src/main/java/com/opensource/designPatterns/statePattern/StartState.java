package com.opensource.designPatterns.statePattern;

public class StartState implements State{
	
	public void action(Context context) {
		System.out.println("Action started");
		context.setState(this);
	}
	
}
