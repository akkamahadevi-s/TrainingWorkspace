package com.exilant.day2b;
 import java.util.Random;
 import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;;
public class RandomFilterEx {

	public static void main(String[] args) {
		int randomNumber = ThreadLocalRandom.current().nextInt(100,200);
		System.out.println(randomNumber);
		
		System.out.println("-----------------");
		
		Random random = new Random();
		random.ints(10,100,200).forEach(System.out::println);
		
		//in sorted order
		random.ints(10, 100,1200).sorted().forEach(System.out::println);
		
		
		//to generate numbers using stream
		System.out.println("-------20 nums(asc) ------");
		Stream.iterate(10,i->i+1).
		limit(20).sorted().
		forEach(System.out::println);

		//todo sort in desc
		
	}

}
