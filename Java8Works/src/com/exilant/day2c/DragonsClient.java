package com.exilant.day2c;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DragonsClient {

	public static void main(String[] args) {
	List<Dragons> dragonList = Stream.of(
				new Dragons("Errorl","USA",15),
				new Dragons("Errorl","USA",333),
				new Dragons("Firnan","USA",5),
				new Dragons("Hasai","France",12),
				new Dragons("IceFire","USFrance",3)
		).collect(Collectors.toList());
			
	
	
	//to find number of dragons
	Map<String, Long> mapDragonCount = dragonList.stream()
	.collect(Collectors.groupingBy(Dragons::getName,Collectors.counting()));
	System.out.println(mapDragonCount);
	
	//find the sum of dragons based on the name
	Map<String, Integer> sumOfDragons = dragonList.stream().collect(Collectors.groupingBy(Dragons::getName,
			Collectors.summingInt(Dragons::getCount)));
	
	System.out.println("report for sum  of dragons----");
	sumOfDragons.forEach(
			(k,v)-> {
				System.out.println("dragon Name"+k+", Number of Dragons"+v);
			});
	
		//1.TODO
		//write a java 8 snippet to find the stats of the dragonList
	//should display sum/average/min/max/avg of dragons,
	
	//2.TODO
	//find Dragons by country and keep the names of dragons
	//of different countries in the list/set
	
	
	IntSummaryStatistics stats = dragonList.stream().mapToInt((x)->x.getCount()).summaryStatistics();
	
	System.out.println("Sum is"+stats.getSum());
	System.out.println("Max is"+stats.getMax());
	System.out.println("Min is"+stats.getMin());
	System.out.println("Average is"+stats.getAverage());
	System.out.println("Count is"+stats.getCount());
}
}
