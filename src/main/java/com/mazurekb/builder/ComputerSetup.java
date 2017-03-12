package com.mazurekb.Builder;

import java.util.ArrayList;
import java.util.List;

public class ComputerSetup {

	private List<Component> components = new ArrayList<Component>();
	
	public void addComponent(Component component){
		components.add(component);
	}
	
	public float getCost(){
		float cost = 0.0f;
		
		for(Component component : components){
			cost += component.price();
		}
		return cost;
	}
	
	public void showComponents(){
		for(Component component : components){
			System.out.print("Component: " + component.name());
			System.out.print(", Seller: " + component.seller().name());
			System.out.print(", Price: " + component.price());
			System.out.println("");
		}
	}
}
