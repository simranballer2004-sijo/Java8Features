package com.java.functionalInterface;

class ThreadDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("run Method called");
		
	}
	
}
public class RunnableLambdaExample {
	public static void main(String[] args) {
		Thread thread = new Thread(new ThreadDemo());
		thread.run();
		
		//new way to create thread
		Runnable runnable = () -> System.out.println("Run method from lambda");
		Thread threadLambda = new Thread(runnable);
		threadLambda.start();//executes in new thread
		threadLambda.run();//executes in main thread
		
		/*Calling run() directly does NOT create a new thread.

		It simply executes the run() method like a normal method call in the current thread.

		No concurrency is achieved.*/
	}

}
