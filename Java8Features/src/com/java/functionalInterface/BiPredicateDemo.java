package com.java.functionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateDemo implements BiPredicate<String,String>{

	public static void main(String[] args) {
		
		//old way
		BiPredicate<String, String> bipredicate = new BiPredicateDemo();
		System.out.println(bipredicate.test("Simran","simran"));
		System.out.println(bipredicate.test("Simran","Simran"));
		
		//using lambda
		
		BiPredicate<String, String> bipredicateLam = (s1,s2) -> s1.equals(s2);
		System.out.println(bipredicateLam.test("Simran","simran"));
		System.out.println(bipredicateLam.test("Simran","Simran"));


	}

	@Override
	public boolean test(String s1, String s2) {
		return s1.equals(s2);
	}

}
