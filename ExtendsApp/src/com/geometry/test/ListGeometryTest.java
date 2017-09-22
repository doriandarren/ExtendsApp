package com.geometry.test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.geometry.main.Circle;
import com.geometry.main.ETriangle;
import com.geometry.main.Geometry;
import com.geometry.main.ListGeometry;
import com.geometry.main.Rectangle;


public class ListGeometryTest {

	
	//@Test
	public void circleTest() {
		ListGeometry listGeo = new ListGeometry();
		
		listGeo.add(new Circle(1));
		listGeo.add(new Rectangle(3,2));
		listGeo.add(new ETriangle(3));
		
		Assert.assertEquals(3, listGeo.size());
		
	}
	
	
	
	@Test
	public void testSortByAreaTest() {
		
		Geometry[] expected = new Geometry[]{
				new Circle(5),		//78.54
				new Rectangle(3,2), //6
				new ETriangle(3),   //3.8971
				new Circle(1)		//3.1416
		};
		
		
		ListGeometry listGeo = new ListGeometry();
		
		listGeo.add(expected[3]);
		listGeo.add(expected[2]);
		listGeo.add(expected[1]);
		listGeo.add(expected[0]);
		
		ArrayList<Geometry> listResult = listGeo.sortByArea();
		
		/*Geometry[] arrayResult = new Geometry[4];
		listResult.toArray(arrayResult);		
		Assert.assertArrayEquals(expected, arrayResult);*/
		
		Assert.assertEquals(expected[0], listResult.get(0));
		Assert.assertEquals(expected[1], listResult.get(1));
		Assert.assertEquals(expected[2], listResult.get(2));
		Assert.assertEquals(expected[3], listResult.get(3));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * EJEMPLO DE ORDENACION
	 */
	
	//@Test
	public void testArray() {
		
		int[] expected = new int[]{5,4,3,2,1};
		int[] array = new int[]{2,1,3,5,4};
		
		sortGreat(array);
		
		Assert.assertArrayEquals(expected, array);
		
	}
		
	public void sortGreat(int array[]){
		int size = array.length;
		
		for(int k=0; k<size-1;k++){
			for(int i=k+1; i<size;i++){
				if(array[k]<array[i]){
					int tem = array[k];
					array[k] = array[i];
					array[i]=tem;
				}
			}
		}
		
		
		
	}
	

}
