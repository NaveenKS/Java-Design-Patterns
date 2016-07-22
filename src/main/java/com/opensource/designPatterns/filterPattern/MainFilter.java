package com.opensource.designPatterns.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class MainFilter {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("varun", "MALE", true));
		persons.add(new Person("jayanth", "MALE", false));
		persons.add(new Person("karthik", "MALE", true));
		persons.add(new Person("swetha", "FEMALE", false));
		
		//TO DO : Implement a method to print the list
		Criteria  maleCriteria = new Male();
		System.out.println(maleCriteria.meetCriteria(persons));
		
		Criteria  marriedCriteria = new Married();
		System.out.println(marriedCriteria.meetCriteria(persons));
		
		Criteria andCriteria = new AndCriteria(maleCriteria, marriedCriteria);
		System.out.println(andCriteria.meetCriteria(persons));
	}
}
