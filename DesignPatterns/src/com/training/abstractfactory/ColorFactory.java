package com.training.abstractfactory;

//this class is acting like adapter pattern
//which is giving the implementation for the classes which are required
public class ColorFactory extends AbstractFactory{
	
	//we shall not have any implementation for vehicle method
	public IVehicle getVehicle(String vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	public IColor getColor(String color) {
		if(color.equals("red")) {
			return new Red();
		}else if(color.equals("blue")) {
			return new Blue();
		}
		return null;
	}

}
