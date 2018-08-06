package com.training.abstractfactory;

//this class is acting like adapter pattern
//which is giving the implementation for the classes which are required
public class VehicleFactory extends AbstractFactory{
	
	//we shall not have any implementation for Color method
	
	public IVehicle getVehicle(String vehicle) {
		if(vehicle.equals("car")) {
			return new Car();
		}else if(vehicle.equals("truck")) {
			return new Truck();
		}
		return null;
	}
	
	//no implementation for color

	

	public IColor getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}



}
