package com.exilant.day2b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
	public static void main(String[] args) {
		Predicate<Integer> greaterThan = i->i>10;
		Predicate<Integer> lessaeThan = i->i<10;
		
		
		Predicate<Integer> positiveNumbers = i-> i>0;
		Predicate<Integer> betweenRange = i-> i>0 && i<100;
		
		
		//System.out.println(greaterThan.test(100));
		List<Integer> integerList = Arrays.asList(12,23,54,32,-22,-34,2,43,500,400);
		
		//passing single predicate
		List<Integer> greaterThan10List = filteredList(integerList, greaterThan);
		greaterThan10List.forEach(System.out::println);
		
		//we can have compound predicate passed
		Predicate<Integer> compoundPredicate = positiveNumbers.and(betweenRange);
		List<Integer> compoundList = filteredList(integerList,compoundPredicate);
		System.out.println("-------list of values compound predicate----");
		
		compoundList.forEach(System.out::println);
	}
	public static List<Integer> filteredList(List<Integer> numbers, Predicate<Integer> predicate){
		List<Integer> filteredList = new ArrayList<Integer>();
		for(Integer temp:numbers) {
			if(predicate.test(temp)) {
				filteredList.add(temp);
			}
		}
		return filteredList;
	}
}
