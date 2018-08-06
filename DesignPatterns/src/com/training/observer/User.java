package com.training.observer;

public class User implements IObserver{
	
	private IObservable observable = null;
	private String name;
	
	//the constructor is a mapper between the enduser and the notification(product)
	public User(IObservable observable, String name) {
		super();
		this.observable = observable;
		this.name = name;
	}
	
	public void buyMobile(String s) {
		System.out.println("Hurry,i have bought  "+s+", by "+ name);
	}

	@Override
	public void update(String s) {
		buyMobile(s);
	}
	
	public void unSubscribe() {
		observable.remove(this);
	}

}
