package com.digit.test.proj.p1;

import java.util.Scanner;

class operation{
	void function1() throws Exception{
		try {
			System.out.println("Inside func-1");
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Division Operation");
			System.out.println("Enter the numerator");
			int num= sc.nextInt();
			System.out.println("Enter the denominator");
			int den = sc.nextInt();
			
			int res=num/den;
			System.out.println("Divison result is:"+res);
			
		}
		catch(Exception e) {
			System.out.println("Exception handeled in function-1");
			throw e;
		}
		finally {
			System.out.println("Left func-1");
		}
	}
}

public class Rethrowing {
	public static void main(String[] args) throws Exception {
		try {
		System.out.println("Inside Main");
		operation op= new operation ();
	
		op.function1();
		
		}
		catch(Exception e){
			System.out.println("Exception Handled by main");
			
		}
		finally {
			System.out.println("Left Main");
		}
	}
	

}
