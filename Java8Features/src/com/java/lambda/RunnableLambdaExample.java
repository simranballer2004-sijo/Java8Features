package com.java.lambda;

//traditional way to creat thread

class ThreadDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("Run method Called");
		
	}
	
}
public class RunnableLambdaExample {
	 public static void main(String[] args) {
		 Thread thread = new Thread(new ThreadDemo());
		 thread.start();
		 
		 // nrew way to create 
		 Runnable runnable = () -> System.out.println("Run method Called using Lambda..");
		 Thread threadLambda = new Thread(runnable);
		 threadLambda.start();
	 }

}
