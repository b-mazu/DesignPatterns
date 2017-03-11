package com.mazurekb.NullObject;

public class User extends AbstractUser {

	public User(String name){
		this.name = name;
	}
	
	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public String getName() {
		return name;
	}

}
