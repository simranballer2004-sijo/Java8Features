package com.java.defaultstatic;

interface Vehicle {
	//abstract methods
	String getBrand();
	String speedUp();
	String slowDown();
	
	
	//default methods dont have to be overriden 
	default String turnAlarmOn() {
		return "Turning Vehicle alarm On";
	}
	
	default String turnAlarmoff() {
		return "Turning Vehicle alarm Off";
	}
	
	//static method : helper method
	static String getCompany() {
		return "BMW Company";
	}
}

class Car implements Vehicle {

	@Override
	public String getBrand() {
		return "BMW";
	}

	@Override
	public String speedUp() {
		return "The car is Speeding UP";
	}

	@Override
	public String slowDown() {
		return "The car is Slowing DOWN";
	}
	
}
public class DefaultStaticDemo {

	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		System.out.println(vehicle.getBrand());
		System.out.println(vehicle.speedUp());
		System.out.println(vehicle.slowDown());
		
		System.out.println(vehicle.turnAlarmoff()); //default method
		System.out.println(vehicle.turnAlarmOn()); //default method , Still available
		
		System.out.println(Vehicle.getCompany()); //static method is called using Interface/class name
	}

}
