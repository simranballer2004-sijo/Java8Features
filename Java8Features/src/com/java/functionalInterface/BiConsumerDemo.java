package com.java.functionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerDemo implements BiConsumer<String, String>{

	public static void main(String[] args) {
		//old way
		BiConsumer<String, String> biConsumer = new BiConsumerDemo();
		biConsumer.accept("Hello", "World");

		//lambda
		BiConsumer<String,String> biConsumerLambda = (x,y) -> System.out.println(x + " --" + y);
		biConsumerLambda.accept("Simran", "Joshi");
		
	}

	@Override
	public void accept(String t, String u) {
		System.out.println(t + " " + u );
		
	}

}
