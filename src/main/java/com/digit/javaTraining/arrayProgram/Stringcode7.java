package com.digit.javaTraining.arrayProgram;

import java.util.Scanner;

public class Stringcode7 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.next();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
			
		}
		System.out.println("reversed string"+s2);
		if(s1.equals(s2)) {
			System.out.println("It is pallidrom");
		}else {
			System.out.println("It is not pallidrom");
		}
	}

}
