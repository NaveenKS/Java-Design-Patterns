package com.opensource.designPatterns.statePattern;

public class Context {
	public State state;
	
	public void setState(State state){
		this.state = state;
	}
	
	public State getState(){
		return this.state;
	}
}
