package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class Female implements ICriteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
List<Person> femaleList = new ArrayList<Person>();
		
		for(Person temp:persons) {
			if(temp.getGender().equals("female")) {
				femaleList.add(temp);
			}
		}
		return femaleList;
	}

}
