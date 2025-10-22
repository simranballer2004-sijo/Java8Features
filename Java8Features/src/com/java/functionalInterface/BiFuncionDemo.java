package com.java.functionalInterface;

import java.util.function.BiFunction;

public class BiFuncionDemo implements BiFunction<Integer, Integer, Integer>{

	@Override
	public Integer apply(Integer t, Integer u) {
		return (t + u);
	}
	
	public static void main(String[] args) {
		
		//old way
		BiFunction<Integer, Integer, Integer> biFunsction = new BiFuncionDemo();
		System.out.println(biFunsction.apply(10,  1));
		System.out.println(biFunsction.apply(10,  23));
		
		//Susing lambda
		
		BiFunction<Integer,Integer,Integer> bf = (t,u) -> t * u;
		System.out.println(bf.apply(102,  1));
		System.out.println(bf.apply(10,  232));

	}

}
