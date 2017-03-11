package com.mazurekb.NullObject;

public class UserFactory {

	public static final String[] names = {"Mike", "Jack", "John"};
	
	public static AbstractUser getUser(String name){
		for(int i=0; i<names.length; i++){
			if(names[i].equalsIgnoreCase(name)){
				return new User(name);
			}
		}
		return new NullUser();
	}
}
