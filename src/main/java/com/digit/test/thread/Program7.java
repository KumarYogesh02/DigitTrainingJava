package com.digit.test.thread;

public class Program7 implements Runnable {
	public static void main(String[] args) {
		Program7 p7= new Program7();
		ThreadGroup tg1=new ThreadGroup("group-1");
		Thread t1= new Thread(tg1, p7, "First-Thread");
		t1.start();
		
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"-----"+Thread.currentThread().getThreadGroup());
		
	}
	

}
