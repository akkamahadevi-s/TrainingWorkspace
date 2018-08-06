package com.training.observer;

import java.util.ArrayList;
import java.util.List;

public class OnePlus6T implements IObservable{
	
	private List<IObserver> users;
	
	private boolean isArrived = true;
	
	public OnePlus6T() {
		users= new ArrayList<IObserver>();
	}
	@Override
	public void addUser(IObserver observer) {
		users.add(observer);
		
	}

	@Override
	public void remove(IObserver observer) {
		users.remove(observer);
		
	}
	public void notifyObserver() {
		
		for(IObserver temp: users) {
			temp.update(this.getClass().getSimpleName());
		}
	}
	
	public boolean isArrived() {
		return isArrived;
	}
	
	public void serArrived(boolean isArrived){
		this.isArrived = isArrived;
		notifyObserver();
	}
}
