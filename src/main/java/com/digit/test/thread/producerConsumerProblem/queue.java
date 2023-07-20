package com.digit.test.thread.producerConsumerProblem;

public class queue {
	int x=0;
	boolean value_of_x=false; 
	synchronized void get() {
		try {
			if(value_of_x!=false) {

				System.out.println("Consumer has consumed the value "+x);
				value_of_x=false;
				notify();

			}
			else {
				wait();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	synchronized void put(int i) {
		try {
			if(value_of_x!=true) {
				x=i;
				System.out.println("Producer has produced the value "+x);
				value_of_x=true;
				notify();
			}
			else {
				wait();
			}

		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
