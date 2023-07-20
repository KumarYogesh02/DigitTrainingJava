package com.digit.test.thread;
import java.util.*;
class Operations extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("banking")) {
			banking();
		}
		else if(Thread.currentThread().getName().equals("printing")){
			printing();
		}
		else if(Thread.currentThread().getName().equals("add")) {
			add();
		}
	}
	void banking() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Banking Operation");
		System.out.println("Enter the acc:");
		int acc= sc.nextInt();
		System.out.println("Enter the pin:");
		int pin= sc.nextInt();
		System.out.println("Banking Completed");
	}
	void printing() {
		try {
		System.out.println("Printing Operation");
		for(int i=0;i<=5;i++) {
			System.out.println("Hi goood morning");
			Thread.sleep(3000);
		}
		System.out.println("Printing Completed");
		}catch(Exception e) {
			
		}
	}
	void add() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Addition Start");
		System.out.println("Enter the num1");
		int num1=sc.nextInt();
		System.out.println("Enter the num2");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println("Result is :"+res);
		System.out.println("Addition is completed");
	}
}

public class Program2 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		Operations op= new Operations();
		op.setName("banking");
		
		Operations op1= new Operations();
		op1.setName("printing");
		Operations op2= new Operations();
		op2.setName("add");
		
		
		op.start();
	
		op1.start();
		op2.start();
		System.out.println("Main Terminated");
	}

}
