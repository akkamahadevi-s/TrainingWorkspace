package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("Lohit","male","single"));
		list.add(new Person("Ramana","male","single"));
		list.add(new Person("Kavita","female","single"));
		list.add(new Person("Joshna","female","married"));
		list.add(new Person("Priya","female","married"));
		list.add(new Person("Vinod","male","married"));
		
		ICriteria maleCriteria = new Male();
		System.out.println("Only male");
		maleCriteria.meetCriteria(list).forEach(System.out::println);
		
		System.out.println("---------------");
		 
		
		ICriteria femaleCriteria = new Female();
		System.out.println("only female");
		femaleCriteria.meetCriteria(list).forEach(System.out::println);
		
		
		System.out.println("---------------");
		 
		ICriteria marriedCriteria = new Married();
		System.out.println("only married");
		marriedCriteria.meetCriteria(list).forEach(System.out::println);
		
		System.out.println("---------------");
		 
		ICriteria singleCriteria = new Single();
		System.out.println("only single");
		singleCriteria.meetCriteria(list).forEach(System.out::println);
		
		System.out.println("---------------");
		
		ICriteria andCriteria = new AndCriteria(maleCriteria,marriedCriteria);
		System.out.println("Male and married");
		andCriteria.meetCriteria(list).forEach(System.out::println);
		
		System.out.println("---------------");
		
		ICriteria orCriteria = new OrCriteria(maleCriteria,marriedCriteria);
		System.out.println("Male or married");
		orCriteria.meetCriteria(list).forEach(System.out::println);
System.out.println("---------------");
		
		ICriteria orCriteria1 = new NegatCriteria(maleCriteria);
		System.out.println("Male or married");
		orCriteria1.meetCriteria(list).forEach(System.out::println);
	}

}
