package com.mazurekb.builder;

public abstract class CPU implements Component {

	public Seller seller() {
		return new Amazon();
	}

	public abstract float price();
}
