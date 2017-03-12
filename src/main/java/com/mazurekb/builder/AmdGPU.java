package com.mazurekb.Builder;

public class AmdGPU extends GPU{

	public String name() {
		return "AMD Fury RX 500";
	}

	@Override
	public float price() {
		return 250.0f;
	}

}
