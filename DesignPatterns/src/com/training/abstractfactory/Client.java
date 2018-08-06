package com.training.abstractfactory;

public class Client {

	public static void main(String[] args) {
		AbstractFactory vehicleFactory = Factoryproducer.getFactory("vehicle");
		IColor redColor = Factoryproducer.getFactory("color").getColor("red");
		IVehicle fordcar = vehicleFactory.getVehicle("car");
		fordcar.move();
		fordcar.speed(120);
		fordcar.paint(redColor);
		
		System.out.println("-------------");
		
		IVehicle manTruck = vehicleFactory.getVehicle("truck");
		manTruck.move();
		manTruck.speed(65);
		manTruck.paint(redColor);
		
		
		
	}

}
