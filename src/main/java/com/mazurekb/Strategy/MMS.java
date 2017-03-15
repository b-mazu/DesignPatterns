package com.mazurekb.Strategy;

public class MMS implements Price {

	public double getCost(double quantity) {
		return 0.15 * quantity;
	}

}
