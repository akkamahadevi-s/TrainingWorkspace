package com.training.bridge;

//this shall be treated as abstract class
//since the reference color is kept here
public abstract class Shape {
	private IColor color;
	protected IColor getColor() {
		return color;
	}

	protected void setColor(IColor color) {
		this.color = color;
	}

	public Shape(IColor color) {
		this.color = color;
	}
	
	public abstract void applyColor();
}
