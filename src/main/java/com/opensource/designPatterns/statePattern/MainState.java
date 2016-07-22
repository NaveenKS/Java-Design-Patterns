package com.opensource.designPatterns.statePattern;

public class MainState {
	public static void main(String[] args){
		Context context = new Context();
		State startState = new StartState();
		startState.action(context);
		System.out.println(context.getState());
		
	}
}
