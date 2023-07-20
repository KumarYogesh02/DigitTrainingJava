package com.digit.test.thread.producerConsumerProblem;

public class Consumer extends Thread {
	queue b;
	public Consumer (queue q) {
		b=q;
		
	}
	public void run() {
		while(true) {
			b.get();
		}
	}
}
