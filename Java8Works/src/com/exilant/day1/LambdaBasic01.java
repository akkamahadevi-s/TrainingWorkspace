package com.exilant.day1;

import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

public class LambdaBasic01 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,30,40,50,60);
		
		System.out.println("------- before jdk 1.5----");
		
		//<jdk1.5
		for(int i=0;i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		
		System.out.println("-------post jdk 1.5----");
		//till jdk1.7
		for(Integer temp:numbers) {
			System.out.println(temp);
		}
		
		System.out.println("------- with lambda expression----");
		numbers.forEach((t) -> System.out.println(t));
		
		
		
		numbers.forEach((Integer temp) -> System.out.println(temp));
		
	   //behind the screen
		System.out.println("----with consumer----");
		numbers.forEach(new Consumer<Integer>(){
			
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		
		//in lambda way 1.8
		System.out.println("-----in lambda way(01)---");
		numbers.forEach((temp) -> System.out.println(temp));
		
		//this is called as method references
		System.out.println("--------with lambda way(01)----");
		numbers.forEach(System.out :: println);
		
		//sum of numbers
		
		int result=0;
		for(int temp:numbers) {
			result+= temp*2;
		
		}
		
       System.out.println("Result"+result);
       
       System.out.println(numbers.stream().map(e->e*2).reduce((res,e)-> res+2));
	}

}
