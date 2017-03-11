package com.mazurekb.NullObject;

public class NullUser extends AbstractUser{

	public NullUser(){
		
	}
	
	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return "Object is null";
	}
	
}
