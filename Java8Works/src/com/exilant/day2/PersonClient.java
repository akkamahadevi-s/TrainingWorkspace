package com.exilant.day2;

import java.util.Arrays;
import java.util.List;

public class PersonClient {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(
				new Person(101,"rohit"),
				new Person(102,"roopa"),
				new Person(103,"sanvi"),
				new Person(104,"kushal")
				);
		
		personList.forEach(System.out::println);
		PersonConsumer print = new PersonConsumer();
		personList.forEach(print);
		
		
		/*System.out.println("------------");
		personList.forEach(PrintConsumer::print);
*/
	}

}
