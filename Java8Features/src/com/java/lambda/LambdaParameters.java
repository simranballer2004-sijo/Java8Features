package com.java.lambda;


interface Addable {
	int addition(int a, int b);
}

class AddableImpl implements Addable {
	
	@Override
	public int addition(int a, int b) {
		return (a + b);
	}
}
public class LambdaParameters {
	public static void main(String[] args) {
	
		Addable addSum = ( a, b) -> (a + b);
		System.out.println(addSum.addition(5,644));
		
		//other way if we want multiple statements
		Addable addSumTwo = (a, b) -> {
			int c = a+b;
			return c;
		};
		int sum = addSumTwo.addition(10, 1);
		System.out.println(sum);
	}

}
