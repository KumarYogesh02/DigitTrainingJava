package com.digit.javaTraining.arrayProgram;

import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter th statement");
		String s1=sc.nextLine();
		String s2=s1.toLowerCase();
	
		int count=0;
		for(int j=0;j<s1.length();j++) {
			if(s1.charAt(j)=='a'||s1.charAt(j)=='e'||s1.charAt(j)=='i'||s1.charAt(j)=='o'||s1.charAt(j)=='u') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
