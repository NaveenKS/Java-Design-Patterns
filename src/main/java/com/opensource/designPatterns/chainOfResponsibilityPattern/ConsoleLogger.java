package com.opensource.designPatterns.chainOfResponsibilityPattern;

public class ConsoleLogger extends AbstractLogger{

	public ConsoleLogger(int level) {
		super(level);
	}

	@Override
	public void writeMessage(String message) {
		System.out.println("Console logger : writing to console - "+message);
	}

}
