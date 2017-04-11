package com.mazurekb.AbstractFactory;

public class StudentFactory extends AbstractFactory {

	@Override
	public Profession getProfession(String profession) {
		return null;
	}

	@Override
	public Student getStudent(String student) {
		if (student == null) {
			return null;
		}
		if (student.equalsIgnoreCase("MATH")) {
			return new Math();
		} else if (student.equalsIgnoreCase("COMPUTERSCIENCE")) {
			return new ComputerScience();
		} else if (student.equalsIgnoreCase("LAW")) {
			return new Law();
		}
		return null;
	}

}
