package com.training.abstractfactory;

public interface IVehicle {
	void move();
	void speed(int maxSpeed);
	void paint(IColor color);
}

 class Car implements IVehicle{

	@Override
	public void move() {
		
		System.out.println("Carr is moving");
	}

	@Override
	public void speed(int maxSpeed) {
		
		System.out.println("Max speed of Car is "+maxSpeed);
	}
	public void paint(IColor color) {
		color.paintCar();
	}
	
}

class Truck implements IVehicle{

	@Override
	public void move() {
		System.out.println("Truck is moving");
		
	}

	@Override
	public void speed(int maxSpeed) {
		System.out.println("Max speed of truck is "+maxSpeed);
		
	}

	@Override
	public void paint(IColor color) {
		color.paintCar();
	}
	
}