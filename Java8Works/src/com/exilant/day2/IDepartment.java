package com.exilant.day2;

public interface IDepartment {
	public void WorkLocation();
	
	default void noOfHrs() {
		System.out.println("the project demands to work only still 6 pm");
	}
	
	public static void commonUtility() {
		System.out.println("All Employee have to pass background verification");
	}
}
