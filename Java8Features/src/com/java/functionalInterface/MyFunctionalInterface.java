package com.java.functionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {
	void print(String msg); //only one abstract method
	
	default void m1() { //any number of default methods and can be overriden 
		System.out.println("Default method");
	}
	
	static void m2() { //any number of static methods , cannot be overriden 
		System.out.println("static method");
	}

}
