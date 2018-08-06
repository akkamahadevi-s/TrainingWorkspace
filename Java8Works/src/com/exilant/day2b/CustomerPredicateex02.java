package com.exilant.day2b;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomerPredicateex02 {

	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(
				new Customer(101,"ramu",6000,"Engineer"),
				new Customer(102,"pooja",6500,"Developer"),
				new Customer(103,"ravi",7500,"Lead"),
				new Customer(104,"raju",5600,"programmer"),
				new Customer(105,"rohit",6000,"Engineer")
				);
		List<Customer> filteredCustomers = filteredList(customers,isEngineerGreaterThan5k());
		filteredCustomers.forEach(System.out::println);

	}
	public static List<Customer> filteredList(List<Customer> customers, Predicate<Customer> Predicate){
		return customers.stream().filter(Predicate).collect(Collectors.<Customer>toList());
	}
	
	public static Predicate<Customer> isEngineerGreaterThan5k(){
		return p->p.getDesignation().equals("Engineer")&& p.getCustomerPurchase()>5000;
	}

}
