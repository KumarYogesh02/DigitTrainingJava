package com.digit.test.thread;

class Warrior extends Thread{
	String res1="Brahmastra";
	String res2="Sarpastra";
	String res3="pashupatastra";
	public void run() {
		if(Thread.currentThread().getName().equals("Arjuna")) {
			arjunaAcq();
		}
		else
		{
			KarnaAcq();
		}
	}
	private void KarnaAcq() {
		try {
			synchronized(res1) {
				System.out.println("Karna Acquired "+res1);
				Thread.sleep(3000);
				synchronized(res2) {
					System.out.println("Karna Acquired "+res2);
					Thread.sleep(3000);
					synchronized(res3) {
						System.out.println("Karna Acquired "+res3);
						Thread.sleep(3000);
					}
				}
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	private void arjunaAcq() {
		try {
			synchronized(res1) {
				System.out.println("Arjuna Acquired "+res1);
				Thread.sleep(3000);
				synchronized(res2) {
					System.out.println("Arjuna Acquired "+res2);
					Thread.sleep(3000);
					synchronized(res3) {
						System.out.println("Arjuna Acquired "+res3);
						Thread.sleep(3000);
					}
				}
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

public class Program5 {
	public static void main(String[] args) {
		Warrior w= new Warrior();
		Warrior w1= new Warrior();
		w.setName("Karna");
		w1.setName("Arjuna");
		
		w.start();
		w1.start();
		
	}

}


