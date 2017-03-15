package com.mazurekb.Strategy;

public class SMS implements Price {

	public double getCost(double quantity) {
		return 0.07 * quantity;
	}

}
