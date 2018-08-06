package com.training.factory;

public abstract class Car {
	public static Car getCar(CarName carName) {
		if(carName==CarName.Maruti) {
			return new Maruti();
		}else if(carName==CarName.BMW) {
			return new BMW();
		}else if(carName==CarName.Audi) {
			return new Audi();
		}
		return null;
	}
	public abstract void drive() ;
	
}
