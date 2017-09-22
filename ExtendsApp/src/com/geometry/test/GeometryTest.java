package com.geometry.test;

import org.junit.Assert;
import org.junit.Test;

import com.geometry.main.Circle;
import com.geometry.main.ETriangle;
import com.geometry.main.Rectangle;



public class GeometryTest {
	
	@Test
	public void circleTest(){		
		Circle circle = new Circle(5);		
		Assert.assertEquals(78.54, circle.computerArea(),0.1);
		Assert.assertEquals(31.41, circle.computerPerimetro(),0.1);		
	}
	
	@Test
	public void triangleTest(){		
		ETriangle triangle = new ETriangle(3);		
		Assert.assertEquals(3.8791, triangle.computerArea(),0.1);
		Assert.assertEquals(9, triangle.computerPerimetro(),0.1);		
	}

	@Test
	public void rectangleTest(){		
		Rectangle rect = new Rectangle(2,3);		
		Assert.assertEquals(6, rect.computerArea(),0.1);
		Assert.assertEquals(10, rect.computerPerimetro(),0.1);		
	}
	
}
