package com.opensource.designPatterns.filterPattern;

import java.util.List;

public class AndCriteria implements Criteria{
	Criteria one,two;
	public AndCriteria(Criteria one,Criteria two){
		this.one = one;
		this.two = two;
	}
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> oneCriteraiList = one.meetCriteria(persons);
		List<Person> andCriteriaList = two.meetCriteria(oneCriteraiList);
		return andCriteriaList;
	}
}
