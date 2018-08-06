package com.training.abstractfactory;

public interface IColor {
	void paintCar();
}

class Red implements IColor{
	@Override
	public void paintCar() {
		System.out.println("Car painting color red");
	}
}


class Blue implements IColor{
	@Override
	public void paintCar() {
		System.out.println("Car painting color blue");
	}
}
