package com.digit.test.proj.p1;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public String getMessage() {
		return "Your age is under 18";
		
	}
}
class OverAgeException extends Exception{
	public String getMessage() {
		return "You old now";
	}
}

class Candidate{
	int age;
	void getData() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age");
		age= sc.nextInt();
	}
	void verify()throws Exception {
		if(age<18) {
			UnderAgeException uae= new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>60) {
			OverAgeException oae= new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}
		else {
			System.out.println("you are qualified");
		}
	}

	
}
class RTO{
	void grantLicense(Candidate c) {
		try {
			c.getData();
			c.verify();
		}
		catch(Exception e){
			try {
				c.getData();
				c.verify();
			}catch(Exception e1){
				
				try {
					c.getData();
					c.verify();
				}catch(Exception e2) {
					System.out.println("GO HOME YOU ARE BANNED NOW");
				}
				
			}
		}
	}
}
public class CustomExp {
	public static void main(String[] args) {
		Candidate c1= new Candidate();
		RTO rto=new RTO();
		rto.grantLicense(c1);
	}

}
