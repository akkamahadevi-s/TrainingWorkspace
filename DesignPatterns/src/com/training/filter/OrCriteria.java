package com.training.filter;

import java.util.List;

public class OrCriteria implements ICriteria{
	
	private ICriteria first;
	private ICriteria second;
	
	
	public OrCriteria(ICriteria first, ICriteria second) {
		super();
		this.first = first;
		this.second = second;
	}


	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		List<Person> firstList = first.meetCriteria(persons);
		List<Person> secondList = second.meetCriteria(persons);
		
		//firstList.addAll(secondList);
		
		for(Person temp : secondList) {
			if(!firstList.contains(temp)) {
				firstList.add(temp);
			}
		}
		return firstList;
 	}

}
