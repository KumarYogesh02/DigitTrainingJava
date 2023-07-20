package com.digit.test.thread.producerConsumerProblem;

public class ProducerConsumerProblem {
	public static void main(String args[]) {
		queue q= new queue();
		Producer p= new Producer(q);
		Consumer c= new Consumer(q);
		
		p.start();
		c.start();
	}

}
