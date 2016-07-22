package com.opensource.designPatterns.templatePattern;

public class Football extends Game{

	@Override
	public void initialize() {
		System.out.println("Initialized");
		
	}

	@Override
	public void start() {
		System.out.println("Game started");
		
	}

	@Override
	public void end() {
		System.out.println("Game ended");
		
	}

}
