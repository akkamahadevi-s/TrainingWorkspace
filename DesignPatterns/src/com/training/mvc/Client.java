package com.training.mvc;

public class Client {
	public static void main(String[] args) {
		//this comes from db or external resources
		Employee model = new Employee(101,"Divya");
		StarView view = new StarView();
		
		EmployeeController controller = new EmployeeController(model,view);
		controller.updateView("star");
	}
	
	private static Employee retrive() {
		return new Employee(101,"Divya");
	}

}
