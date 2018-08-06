package com.training.factory;

public class FactoryClient {

	public static void main(String[] args) {
		Car car = Car.getCar(CarName.Audi);
		car.drive();
		
		 car = Car.getCar(CarName.Maruti);
		car.drive();
	}

}
