package com.java.methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable {
	void print(String msg);
}

public class MethodRefClass {
	
	public void display(String msg) {
		msg = msg.toUpperCase();
		System.out.println(msg);
	}
	
	public static int addition(int a, int b) {
		
		return a + b;
	}

	public static void main(String[] args) {
		//1. Method ref to a Static method
		//using lambda
		Function<Integer, Double> function = (x) -> Math.sqrt(x);
		System.out.println(function.apply(4));
		//using method reference
		Function<Integer, Double> methodRef = Math::sqrt;
		System.out.println(methodRef.apply(9));
		
		//Example 2 //using lambda
		BiFunction<Integer, Integer, Integer> biFuncLambda = (a,b) -> MethodRefClass.addition(a, b);
		System.out.println(biFuncLambda.apply(5, 6));
		//using method reference
		BiFunction<Integer, Integer, Integer> biFuncRef = MethodRefClass::addition;
		System.out.println(biFuncRef.apply(11, 12));
		
		
		//2. Method ref to an instance method of that object //using lambda
		MethodRefClass methodRefClass = new MethodRefClass();
		Printable printableLambda = (msg) -> methodRefClass.display(msg);
		printableLambda.print("simran");
		//using method reference
		Printable printableMethodref = methodRefClass::display;
		printableMethodref.print("joshi");
		
		//3. Reference to an instance method of an arbitrary object of a particular type
		//using lambda
		Function<String, String> stringFunc = (input) -> input.toLowerCase();
		System.out.println(stringFunc.apply("HELLO"));
		//using method reference
		Function<String, String> stringMethodRef = String::toLowerCase;
		System.out.println(stringMethodRef.apply("WORLD"));
		
		//example 2;
		//using lambda
		String[] strArray = {"A", "E","I","O","U"};
		Arrays.sort(strArray, (s1,s2)-> s1.compareToIgnoreCase(s2));
		//using method reference
		Arrays.sort(strArray, String::compareToIgnoreCase);
		
		//4. Reference to a constructor
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("mango");
		fruits.add("orange");
		//using lambda
		Function<List<String>, Set<String>> setFunction = (fruitList) -> new HashSet<>(fruitList);
		System.out.println(setFunction.apply(fruits));
		//using method reference
		Function<List<String>, Set<String>> setMethodFunction = HashSet::new;
		System.out.println(setMethodFunction.apply(fruits));
	}

}
