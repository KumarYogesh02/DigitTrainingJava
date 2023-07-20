package com.digit.test.thread;

import java.util.Scanner;

class Addition extends Thread{
	public void run() {
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
class printing extends Thread{
	public void run() {
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
}
class Banking extends Thread{
	public void run() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Banking Operation");
	System.out.println("Enter the acc:");
	int acc= sc.nextInt();
	System.out.println("Enter the pin:");
	int pin= sc.nextInt();
	System.out.println("Banking Completed");
	}
}

public class Program3 {
	public static void main(String[] args) {
		
	
	Addition add= new Addition();
	printing pr= new printing();
	Banking b= new Banking();
	
	add.start();
	pr.start();
	b.start();
	
	}
}
