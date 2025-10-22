package com.java.lambda;


interface Shape { //functional interface
	void draw(); //one abstract method
}
/* polymorphism oops concept


class Rectangle implements Shape {
	
	@Override
	public void draw() {
		System.out.println("Rectangle class : draw() method");
	}
}

class Square implements Shape {
	@Override
	public void draw() {
	System.out.println("Square class : draw() method");

	}
}

class Circle implements Shape {
	@Override
	public void draw() {
	System.out.println("Circle class : draw() method");

	}
}

old way can be done using lambda
oops -> functional programming */

public class LambdaExample {
	public static void main(String[] args) {
		//we are using shape because it has to be a functional interface
		//java 8 compiler will look at the return type of the abstract method and infer to that 
		Shape rectangle =  () ->  System.out.println("Rectamgle class : draw() method");
		rectangle.draw();
		Shape square = () -> System.out.println("Square class : draw() method");
		square.draw();
		Shape circle = () -> System.out.println("Circle class : draw() method");
		circle.draw();
		
		
		//pass lambda expression as method parameter
		print(rectangle);
		print(() -> System.out.println("Triangle class : draw() method"));
		print(circle);
			
	}
	
	
	private static void print(Shape shape) {
		shape.draw();
	}
}
