package com.training.observer;

public class Client {
	public static void main(String[] args) {
		
		IObservable observable = new OnePlus6T();
		
		IObservable observable2 = new AppleX1();
		
		IObserver user1 = new User(observable, "kumar");
		IObserver user2 = new User(observable, "Anuj");
		IObserver user3 = new User(observable, "Shweta");
		IObserver user4 = new User(observable, "Krishna");
		
		observable.addUser(user1);
		observable.addUser(user2);
		observable.addUser(user3);
		observable.addUser(user4);
		
		((OnePlus6T)observable).serArrived(true);
		System.out.println("-----");
		
		/*IObservable observable2 = new AppleX1();
		IObserver user5= new User(observable2, "Ravi");
		IObserver user6 = new User(observable2,  "asha");
		
		observable2.addUser(user5);
		observable2.addUser(user6);
		
		((AppleX1)observable2).serArrived(false);*/
		IObserver user11 = new User(observable2, "kumar");
		IObserver user22 = new User(observable2, "Anuj");
		IObserver user33 = new User(observable2, "Shweta");
		IObserver user44 = new User(observable2, "Krishna");
		
		observable2.addUser(user11);
		observable2.addUser(user22);
		observable2.addUser(user33);
		observable2.addUser(user44);
		
		((AppleX1)observable2).serArrived(true);
		
	}

}
