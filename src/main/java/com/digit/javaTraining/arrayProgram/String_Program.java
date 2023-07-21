package com.digit.javaTraining.arrayProgram;

import java.util.Scanner;

public class String_Program {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1=sc.next();
		System.out.println("Enter the second string");
		String s2=sc.next();
		if(s1.equals(s2)==true) {
			System.out.println("True");
			
		}
		else {
			System.out.println("False");
		}
		if(s1.equalsIgnoreCase(s2)==true) {
			System.out.println("True");
			
		}
		else {
			System.out.println("False");
		}
		if(s1.compareTo(s2)==0) {
			System.out.println("True");
			
		}
		else {
			System.out.println("False");
		}
	}

}
