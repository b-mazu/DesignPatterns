package com.mazurekb.AbstractFactory;

public class ProfessionFactory extends AbstractFactory {

	@Override
	public Profession getProfession(String profession) {
		if (profession == null) {
			return null;
		}

		if (profession.equalsIgnoreCase("DOCTOR")) {
			return new Doctor();
		} else if (profession.equalsIgnoreCase("TEACHER")) {
			return new Teacher();
		} else if (profession.equalsIgnoreCase("LAWYER")) {
			return new Lawyer();
		}

		return null;
	}

	@Override
	public Student getStudent(String student) {
		return null;
	}
}
