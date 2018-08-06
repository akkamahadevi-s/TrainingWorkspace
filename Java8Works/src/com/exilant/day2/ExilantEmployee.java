package com.exilant.day2;

public class ExilantEmployee implements IEmployee,IDepartment{
	
	@Override
	public void salary() {
		System.out.println("the salary is decided by the project you work");
	}
	
	@Override
	public void noOfHrs() {
		IEmployee.super.noOfHrs();
	}
	
	@Override
	public void WorkLocation() {
		System.out.println("work location is bengaluru");
	}

}
