package com.training.ServiceLocator;

public class ERPService implements Service{
	public String getName() {
		return "erp";
	}
	public void execute() {
		System.out.println("We executing ERP service");
	}
}
