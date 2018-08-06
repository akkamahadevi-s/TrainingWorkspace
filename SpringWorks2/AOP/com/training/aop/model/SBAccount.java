package com.training.aop.model;

public class SBAccount {
	
	private Account acc;

	public Account getAcc() {
		return acc;
	}

	@Override
	public String toString() {
		return "SBAccount [acc=" + acc + "]";
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}
	

}
