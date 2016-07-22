package com.opensource.designPatterns.filterPattern;

public class Person {
	String name;
	String gender;
	//int age;
	boolean married;
	public Person(String name, String gender, boolean married ){
		this.name = name;
		this.gender = gender;
		this.married = married;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getGender(){
		return this.gender;
	}
	
	public boolean getMarriedStatus(){
		return this.married;
	}
}
