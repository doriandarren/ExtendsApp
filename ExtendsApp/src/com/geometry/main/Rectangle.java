package com.geometry.main;

public class Rectangle extends Geometry {

	private float side1;
	private float side2;

	public Rectangle(float side1, float side2) {
		super(4);
		this.side1=side1;
		this.side2=side2;
	}

	@Override
	public float computerArea() {
		return side1*side2;
	}

	@Override
	public float computerPerimetro() {
		return (side1*2) + (side2*2);
	}
	
}
