package com.training.mvc;

public class StarView {
	public void printEmployee(Employee employee) {
		System.out.println("***************");
		System.out.println("Employee Id "+employee.getEmpId());
		
		System.out.println("Employe Name "+employee.getEmpName());
		System.out.println("***************");
		
	}

}
