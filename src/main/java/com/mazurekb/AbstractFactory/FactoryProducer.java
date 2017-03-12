package com.mazurekb.AbstractFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("PROFESSION")) {
			return new ProfessionFactory();
		} else if (choice.equalsIgnoreCase("STUDENT")) {
			return new StudentFactory();
		}
		return null;
	}
}
