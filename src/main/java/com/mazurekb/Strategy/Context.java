package com.mazurekb.Strategy;

public class Context {
	private Price Price;
	
	public Context(Price Price){
		this.Price = Price;
	}
	
	public double executePrice(double quantity){
		return Price.getCost(quantity);
	}
}
