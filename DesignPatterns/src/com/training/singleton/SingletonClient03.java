package com.training.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonClient03 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton singletonI1 = Singleton.getInstance();
		Singleton singletonI2 = null;
		Singleton singletonI3 = null;
		
		Constructor[] constructors = Singleton.class.getDeclaredConstructors();
		
		for(Constructor constructor: constructors) {
			//with this statement we can access private methods
			//or constructors etc etc
			
			constructor.setAccessible(true);
			singletonI2 = (Singleton) constructor.newInstance();
			singletonI3 = (Singleton) constructor.newInstance();
			break;
		}
		System.out.println("Instance one - hashcode"+ singletonI1);
		System.out.println("Instance two - hashcode"+ singletonI2);
		System.out.println("Instance three - hashcode"+ singletonI3);
		
	}

}
