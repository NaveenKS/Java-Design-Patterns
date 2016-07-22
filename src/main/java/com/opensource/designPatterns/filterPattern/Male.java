package com.opensource.designPatterns.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class Male implements Criteria{

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> filteredList = new ArrayList<Person>();
		for(Person person : persons){
			if(person.getGender().equals("MALE")){
				filteredList.add(person);
			}
		}
		return filteredList;
	}
	
}
