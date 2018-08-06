package com.training.basics;

public class DefaultHello implements HelloService {

private String name;
	private String city;
	
	public DefaultHello() {
		this.name = "no name"; 
		this.city ="default city"; 
		
	}
	

	public DefaultHello(String name, String city) {
		super();
		this.name = name;
	this.city = city;
	}

	public String getName() {
		return name;
}
	public void setName(String name) {
	this.name = name;
}

	public  String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String sayHello() {
		return this.sayHello(name , city);
	}

	// values for this is given by configuration file
	public String sayHello(String name, String city) {
		String myStrs[] = { "hey how are you Mr/Ms/Mrs %s & how is your city %s", "Good Morning %s,are you in %s",
				"Mr/Ms/Mrs %s","your city is beautiful %s" };

		int randomNumber = (int)(Math.random() *3);
		return String.format(myStrs[randomNumber], name, city);
	}
	
	public void ginit() {
		System.out.println("Global init is default hello...");
	}
	public void gdestroy() {
		System.out.println("Global destroy is default hello...");
	}
}
