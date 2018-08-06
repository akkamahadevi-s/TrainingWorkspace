package com.exilant.day2b;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
	public static void main(String[] args) throws IOException {
		writeToFile1();
	}
	public static void writeToFile() throws IOException{
		//earlier to 1.8
		BufferedWriter bw=null;
		try {
		 bw = new BufferedWriter(new FileWriter("sample.txt"));
		 bw.write("Hello");
		bw.newLine();
		 bw.write("How are you today");
			bw.newLine();
		 bw.write("Its Nice weather today in bengaluru");
			bw.newLine();
			System.out.println("Dta saved successfully");
		}catch(IOException ieo) {
			ieo.printStackTrace();
		}finally {
			try {
				bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	//in java 1.8
	public static void writeToFile1() throws IOException{
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("newSample.txt"))){
			bw.write("Hello all");
			bw.newLine();
			bw.write("We are in Mission Road");
			bw.newLine();
			bw.write("In Bengaluru");
			bw.newLine();
		}
		System.out.println("Data Saved Successfully");
	}



public static void readFromFile() throws IOException{
	try(
			FileReader fr = new FileReader("newSample.txt");
			BufferedReader br = new BufferedReader(fr);
			
			){
		br.lines().forEach(System.out::println);
		
	}
	
}
}