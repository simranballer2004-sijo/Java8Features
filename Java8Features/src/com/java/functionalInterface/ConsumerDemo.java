package com.java.functionalInterface;

import java.util.function.Consumer;
//Consumer fn Interface takes one input and returns nothing from accept
class ConsumerImpl implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
		
	}
	
}
public class ConsumerDemo {
	public static void main(String[] args) {
		//traditional way
		Consumer<String> consumer = new ConsumerImpl();
		consumer.accept("SIMRAN");
		
		//new way
		Consumer<String> consumerLambda = (s) -> System.out.println(s);
		consumerLambda.accept("JOSHI");
	}
}
