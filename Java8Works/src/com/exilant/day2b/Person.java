package com.exilant.day2b;

public class Person {
	private int pId;
	private String name;
	private int sal;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Person(int pId, String name, int sal) {
		super();
		this.pId = pId;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", name=" + name + ", sal=" + sal + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
