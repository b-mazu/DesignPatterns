package com.mazurekb.Builder;

public class IntelCPU extends CPU{

	public String name() {
		return "Intel I7 6700k";
	}

	@Override
	public float price() {
		return 450.0f;
	}

}
