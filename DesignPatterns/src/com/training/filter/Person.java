package com.training.filter;

public class Person {
	private String name;
	private String gender;
	private String maritalStatus;
	public Person() {
		
	}
	public Person(String name, String gender, String maritalStatus) {
		super();
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getGender() {
		return gender;
	}
	protected void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", maritalStatus=" + maritalStatus + "]";
	}
	protected String getMaritalStatus() {
		return maritalStatus;
	}
	protected void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

}
