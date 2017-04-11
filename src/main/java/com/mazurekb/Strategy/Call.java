package com.mazurekb.Strategy;

public class Call implements Price {

	public double getCost(double quantity) {
		return 0.02 * quantity;
	}

}
