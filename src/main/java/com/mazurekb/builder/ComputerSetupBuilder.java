package com.mazurekb.Builder;

public class ComputerSetupBuilder {
	
	public ComputerSetup forGames(){
		ComputerSetup setup = new ComputerSetup();
		setup.addComponent(new IntelCPU());
		setup.addComponent(new NvidiaGPU());
		return setup;
	}
	
	public ComputerSetup forWork(){
		ComputerSetup setup = new ComputerSetup();
		setup.addComponent(new AmdCPU());
		setup.addComponent(new AmdGPU());
		return setup;
	}
}
