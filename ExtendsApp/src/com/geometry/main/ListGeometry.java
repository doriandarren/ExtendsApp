package com.geometry.main;

import java.util.ArrayList;
import java.util.Comparator;


public class ListGeometry {
	
	private ArrayList<Geometry> list;
		
	public ListGeometry() {
		this.list = new ArrayList<>();
	}
	
	public void add(Geometry item){
		list.add(item);
	}

	public void remove(Geometry item){
		list.remove(item);
	}
	
	public Geometry get(int index){		
		return list.get(index);		
	}
		
	public int size(){
		return list.size();
	}	
	
	
	/** sort method ************************/
	
	public ArrayList<Geometry> sortByArea(){
		ArrayList<Geometry> listResult = new ArrayList<>(this.list);	
		
		//ArrayList<Geometry> list = new ArrayList<>();
		//list.addAll(this.list);		
		
		int size = listResult.size();
				
		for(int i=0; i<listResult.size();i++){
			for(int j=i+1; j<listResult.size();j++){				
				if( listResult.get(i).computerArea() < listResult.get(j).computerArea()){
					Geometry geoAux = listResult.get(i);
					listResult.set(i, listResult.get(j));
					listResult.set(j, geoAux);
				}			
			}			
		}
		
		return listResult;		
	}
	
	public ArrayList<Geometry> sortByPerimeter(){
		ArrayList<Geometry> listResult = new ArrayList<>(this.list);	
		
		//ArrayList<Geometry> list = new ArrayList<>();
		//list.addAll(this.list);		
		
		int size = listResult.size();
				
		for(int i=0; i<listResult.size();i++){
			for(int j=i+1; j<listResult.size();j++){				
				if( listResult.get(i).computerPerimetro()<listResult.get(j).computerPerimetro()){
					Geometry geoAux = listResult.get(i);
					listResult.set(i, listResult.get(j));
					listResult.set(j, geoAux);
				}			
			}			
		}
		
		return listResult;				
	}
	
	public ArrayList<Geometry> sortBySize(){
		ArrayList<Geometry> listResult = new ArrayList<>(this.list);	
		
		//ArrayList<Geometry> list = new ArrayList<>();
		//list.addAll(this.list);		
		
		int size = listResult.size();
				
		for(int i=0; i<listResult.size();i++){
			for(int j=i+1; j<listResult.size();j++){				
				if( listResult.get(i).getSide() < listResult.get(j).getSide()){
					Geometry geoAux = listResult.get(i);
					listResult.set(i, listResult.get(j));
					listResult.set(j, geoAux);
				}			
			}			
		}
		
		return listResult;	
	}
	
	
	
	
	
}
