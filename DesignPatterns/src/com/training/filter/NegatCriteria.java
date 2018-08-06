package com.training.filter;

import java.util.List;

public class NegatCriteria implements ICriteria{
	
	private ICriteria firstCriteria;
	

	public NegatCriteria(ICriteria firstCriteria) {
		super();
		this.firstCriteria = firstCriteria;
		
	}

	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
			
			List<Person> firstList = firstCriteria.meetCriteria(persons);
			persons.removeAll(firstList);
			
			
			return persons;
	 	

	}

}
