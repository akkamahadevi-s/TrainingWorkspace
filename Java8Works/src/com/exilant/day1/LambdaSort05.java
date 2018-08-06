package com.exilant.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSort05 {

	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(
				new Customer(101,"ramu",6000,"Engineer"),
				new Customer(102,"pooja",6500,"Developer"),
				new Customer(103,"ravi",7500,"Lead"),
				new Customer(104,"raju",5600,"programmer"),
				new Customer(105,"rohit",4000,"Engineer")
				);
		System.out.println("-----before sort------");
		customers.forEach(System.out::println);
		
		//jdk1.7 or older
		Collections.sort(customers, new Comparator<Customer>() {
			public int compare(Customer o1, Customer o2) {
				return o1.getCustomerName().compareTo(o2.getCustomerName());
			}
		});
		
		System.out.println("----after sort on name(asc)-----");
		customers.forEach(System.out::println);
		
		//java 8 way
		System.out.println("----after sort on purchasing (asc)-----");
		customers.sort((Customer c1,Customer c2)
				->(int)(c1.getCustomerPurchase()-c2.getCustomerPurchase())
				);
		customers.forEach(System.out::println);
		
		//java 8 way
		System.out.println("-------- after sort on designation-----");
		customers.sort((c1,c2)->c1.getDesignation().compareTo(c2.getDesignation()));
		customers.forEach(System.out::println);
		
		Comparator<Customer> customerNameAscComparator=(c1,c2)->
		c1.getCustomerName().compareTo(c2.getCustomerName());
		
		Collections.sort(customers, customerNameAscComparator);
		System.out.println("-------- After sort on names asc----");
		customers.forEach(System.out::println);
		
		customers.sort(customerNameAscComparator.reversed());
		System.out.println("-------- After sort on names desc----");
		customers.forEach(System.out::println);
		
	}

}
