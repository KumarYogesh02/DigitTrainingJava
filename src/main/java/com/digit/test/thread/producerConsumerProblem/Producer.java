package com.digit.test.thread.producerConsumerProblem;

public class Producer extends Thread {
	queue a;
	public Producer(queue q) {
		a=q;
	}
	public void run() {
		int i=0;
		while(true) {
			a.put(i++);
		}
	}

}
