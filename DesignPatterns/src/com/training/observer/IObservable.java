package com.training.observer;

public interface IObservable {
	public void addUser(IObserver observer);
	public void remove(IObserver observer);
	
	//all those 
	public void notifyObserver();

}
