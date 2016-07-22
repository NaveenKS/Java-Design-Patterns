package com.opensource.designPatterns.chainOfResponsibilityPattern;

public abstract class AbstractLogger {
	public static final int ERROR = 3;
	public static final int DEBUG = 2;
	public static final int INFO = 1;
	protected AbstractLogger abstractLogger;
	int level;
	
	public AbstractLogger(int level){
		this.level = level;
	}
	
	public void nextLogger(AbstractLogger abstractLogger){
		this.abstractLogger = abstractLogger;
	}
	public void logMessage(int level,String message){
		if(this.level <= level){
			writeMessage(message);
		}
		
		if(abstractLogger!=null){
			abstractLogger.logMessage(level,message);
		}
	}
	
	public abstract void writeMessage(String message);
}
