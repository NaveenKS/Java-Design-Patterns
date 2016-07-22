package com.opensource.designPatterns.chainOfResponsibilityPattern;

public class FileLogger extends AbstractLogger{

	public FileLogger(int level) {
		super(level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void writeMessage(String message) {
		System.out.println("Filelogger : writing to file  - "+message);
	}

}
