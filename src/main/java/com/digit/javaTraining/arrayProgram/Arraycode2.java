package com.digit.javaTraining.arrayProgram;

import java.util.Scanner;

public class Arraycode2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the count of the classes");
		int cls = sc.nextInt();
		System.out.println("Enter the count of students in each class");
		int stu= sc.nextInt();

		String arr[][]= new String [cls][stu];
		
		for(int i=0;i<cls;i++) {
			System.out.println("inside the class : "+(i+1));
		
			for(int j=0;j<stu;j++) {
				System.out.println("Enter the student no: "+(j+1)+"Name:");
				arr[i][j]=sc.next();

			}
		}
		for(int i=0;i<cls;i++) {
			System.out.println("inside the class : "+(i+1));
		
			for(int j=0;j<stu;j++) {
				System.out.println("Enter the student no: "+(j+1)+" is "+arr[i][j]);


			}
		}
	}

}
