package com.training.ServiceLocator;

public class DBService implements Service{
	public String getName() {
		return "db";
	}
	public void execute() {
		System.out.println("Executing DBservice");
	}

}
