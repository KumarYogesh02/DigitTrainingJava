package com.digit.javaTraining.arrayProgram;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of the student");
		int n= sc.nextInt();
		String arr[]=new String[n];
		for (int i=0;i<n;i++) {
			System.out.println("Enter the name of the student"+(i+1));
			arr[i]=sc.next();
		}
		for(int i=0;i<n;i++) {
			System.out.println((i+1)+" The student name is: "+(arr[i]));
		}
	}

}
