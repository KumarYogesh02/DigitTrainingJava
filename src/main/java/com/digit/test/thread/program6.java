package com.digit.test.thread;

class Warrior1 extends Thread {
	String res1 = "Brahmastra";
	String res2 = "Sarpastra";
	String res3 = "pashupatastra";

	public void run() {
		if (Thread.currentThread().getName().equals("Arjuna")) {
			arjunaAcq();
		} else {
			KarnaAcq();
		}
	}

	 void KarnaAcq() {
		try {
			synchronized (res1) {
				System.out.println("Karna Acquired " + res1);
				Thread.sleep(3000);
			}
			synchronized (res2) {
				System.out.println("Karna Acquired " + res2);
				Thread.sleep(3000);
			}
			synchronized (res3) {
				System.out.println("Karna Acquired " + res3);
				Thread.sleep(3000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	 void arjunaAcq() {
		try {
			synchronized (res3) {
				System.out.println("Arjuna Acquired " + res3);
				Thread.sleep(3000);
			}
			synchronized (res2) {
				System.out.println("Arjuna Acquired " + res2);
				Thread.sleep(3000);
			}
			synchronized (res1) {
				System.out.println("Arjuna Acquired " + res1);
				Thread.sleep(3000);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

public class program6 {
	public static void main(String[] args) {
		Warrior1 w = new Warrior1();
		Warrior1 w1 = new Warrior1();
		w.setName("Karna");
		w1.setName("Arjuna");

		w.start();
		w1.start();
	}
}
