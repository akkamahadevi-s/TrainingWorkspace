package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class Married implements ICriteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
List<Person> marriedList = new ArrayList<Person>();
		
		for(Person temp:persons) {
			if(temp.getMaritalStatus().equals("married")) {
				marriedList.add(temp);
			}
		}
		return marriedList;

}
}
