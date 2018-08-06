package com.exilant.day1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

//to show working of map and filter based on the customer type
public class StreamMapEx02 {
		
		
		//syntax is upto jdk1.7
		public static List<PriorityCustomer> filterCustomers(List<Customer> customers){
			List<PriorityCustomer> prioritycustomers = new ArrayList<>();
			for(Customer temp :customers) {
				if(temp.getCustomerPurchase()>5000) {
					prioritycustomers.add(new PriorityCustomer
					(temp.getCustomerId(),
					 temp.getCustomerName(),
					 "Gold"));
				}
			}
			return prioritycustomers;
		}
		
		
		
		
		
		//in java 8
		public static List<PriorityCustomer> filterCustomers1(List<Customer> customers){
			List<PriorityCustomer> prioritycustomers = customers.stream().map(temp ->{
				/*if(temp.getCustomerPurchase()>5000) {
					return new PriorityCustomer(temp.getCustomerId(),
							temp.getCustomerName(),"Gold");
				}*/
				return new PriorityCustomer(temp.getCustomerId(),
						temp.getCustomerName(),
						temp.getCustomerPurchase()>0 && temp.getCustomerPurchase()<3000?"Silver":
							temp.getCustomerPurchase()>3000 && temp.getCustomerPurchase()<5000?"Gold":"Platinum");
				//return null;
			}).collect(Collectors.toList());
			return prioritycustomers;
		}
		
		public static List<PriorityCustomer> filterCustomers2(List<Customer> customers){
		return 
				customers.stream().filter(temp-> temp.getCustomerPurchase()>5000).map(temp->{
			return new PriorityCustomer(temp.getCustomerId(),
					temp.getCustomerName(),"Gold");
		}).collect(Collectors.toList());
		}
		
		
		public static void main(String args[]) {

		List<Customer> customers = Arrays.asList(
				new Customer(101,"ramu",6000,"Engineer"),
				new Customer(102,"pooja",6500,"Developer"),
				new Customer(103,"ravi",7500,"Lead"),
				new Customer(104,"raju",5600,"programmer"),
				new Customer(105,"rohit",4000,"Engineer")
				);
		
		filterCustomers(customers).forEach(System.out ::println);
		
		System.out.println("-------------");
		filterCustomers1(customers).forEach(System.out ::println);
		
		System.out.println("-----with filter--------");
		filterCustomers2(customers).forEach(System.out ::println);
				
	}
	

}
