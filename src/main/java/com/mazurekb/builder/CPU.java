package com.mazurekb.Builder;

public abstract class CPU implements Component {

	public Seller seller() {
		return new Amazon();
	}

	public abstract float price();
}
