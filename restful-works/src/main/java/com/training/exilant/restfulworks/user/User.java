package com.training.exilant.restfulworks.user;

import java.util.Date;

public class User {
	private Integer userId;
	private String name;
	private Date birthDate;
	public Integer getUserId() {
		return userId;
	}
	public User() {
		
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	public User(Integer userId, String name, Date birthDate) {
		super();
		this.userId = userId;
		this.name = name;
		this.birthDate = birthDate;
	}

}
