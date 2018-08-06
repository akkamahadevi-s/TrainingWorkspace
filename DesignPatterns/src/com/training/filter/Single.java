package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class Single implements ICriteria{
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlleList = new ArrayList<Person>();
		
		for(Person temp:persons) {
			if(temp.getMaritalStatus().equals("single")) {
				singlleList.add(temp);
			}
		}
		return singlleList;


}
}
