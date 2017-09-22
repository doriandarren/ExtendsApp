package com.geometry.main;

public class Circle extends Geometry {

	private static final float PI=3.1416f;
	
	private float r;
	
	public Circle(int r) {
		super(Integer.MAX_VALUE);
		this.r=r;
	}


	@Override
	public float computerArea(){
		return PI*r*r;	
	}
	
	@Override
	public float computerPerimetro(){
		//return super.computerPerimetro();	
		return 2*PI*r;
	}
		
}
