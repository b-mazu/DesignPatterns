package com.mazurekb.Builder;

public abstract class GPU implements Component {


	public Seller seller() {
		return new NewEgg();
	}

	public abstract float price();

}
