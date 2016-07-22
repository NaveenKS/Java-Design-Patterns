package com.opensource.designPatterns.chainOfResponsibilityPattern;

public class MainLogger {
	public static void main(String[] args) {
			AbstractLogger abstractLogger = getChainOfloggers();
			abstractLogger.logMessage(AbstractLogger.INFO,"This is info");
			abstractLogger.logMessage(AbstractLogger.DEBUG, "This is debug info");
			abstractLogger.logMessage(AbstractLogger.ERROR, "This is error");
	}
	
	public static AbstractLogger getChainOfloggers() {
		AbstractLogger erLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger filLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger conLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		filLogger.nextLogger(conLogger);
		erLogger.nextLogger(filLogger);
		return erLogger;
	}
	
}
