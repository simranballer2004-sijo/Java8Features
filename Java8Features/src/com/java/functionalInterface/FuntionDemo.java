package com.java.functionalInterface;

import java.util.function.Function;

//It represents a function that takes one argument of type T and returns a result of type R.

//old way
class FunctionImpl  implements Function<String/*input*/, Integer/*output*/>{

	@Override
	public Integer apply(String s) {
		return s.length();
	}
	
}
public class FuntionDemo {

	public static void main(String[] args) {
		//old way
		FunctionImpl func = new FunctionImpl();
		System.out.println(func.apply("Simran"));
		
		//new way
		Function<String, Integer> function = (String s) -> s.length();
		System.out.println(function.apply("SimranJoshi"));
		
		
	}
}
