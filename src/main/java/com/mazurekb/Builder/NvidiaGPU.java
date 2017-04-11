package com.mazurekb.Builder;

public class NvidiaGPU extends GPU {

	public String name() {
		return "NVIDIA GTX 1070";
	}

	@Override
	public float price() {
		return 400.0f;
	}

}
