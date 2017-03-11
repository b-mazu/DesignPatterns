package com.mazurekb.builder;

public class AmdCPU extends CPU{

	public String name() {
		return "AMD RYZEN 1800X";
	}

	@Override
	public float price() {
		return 300.0f;
	}

}
