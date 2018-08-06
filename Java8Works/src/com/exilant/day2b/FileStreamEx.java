package com.exilant.day2b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileStreamEx {
	public static void main(String[] args) throws IOException{
		/*Files.list(Paths.get(".")).
		map(Path::getFileName).
		forEach(System.out::println);
		
		System.out.println("-------------");
		
		List<String> list = Stream.of("One","Two","Three","Four").
				map(String::toUpperCase).
				collect(Collectors.toList());
		
		list.forEach(System.out::println);
		*/
		System.out.println("----------");
		Files.list(Paths.get(".")).
		map(Path::getFileName).
		map(Path::toString).
		map(String::toUpperCase)
		.filter(name->name.endsWith("TXT"))
		.sorted()
		.skip(2)
		.limit(5)
		.forEach(name->doSomeAction(name));
	}
	
	
	//given the filename ,show the content of the file
	//and show only those lines which has exilant (either in uppercase or lowercase)
	public static void doSomeAction(String filename) {
		System.out.println("action ->"+filename);
		//System.out.println("your action goes here for"+filename);
	}
}
