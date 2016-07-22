package com.opensource.designPatterns.statePattern;

public class StopState implements State{
	public Context context;

	public void action(Context context) {
		System.out.println("Stopping system");
		context.setState(this);
	}
}
