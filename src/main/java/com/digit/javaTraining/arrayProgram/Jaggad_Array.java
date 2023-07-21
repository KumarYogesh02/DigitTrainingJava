package com.digit.javaTraining.arrayProgram;

import java.util.Scanner;

public class Jaggad_Array {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the count of the classes");
			int cls = sc.nextInt();


			String arr[][]= new String [cls][];
			
			
				for(int i=0;i<arr.length;i++) {
					System.out.println("Enter the student no: "+(i+1)+"Name:");
					int stu = sc.nextInt();
					arr[i]=new String[stu];

				}
			
			for(int i=0;i<arr.length;i++) {
				System.out.println("inside the class : "+(i+1));
			
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("Enter the student no: "+(j+1)+" is ");
					arr[i][j]=sc.next();

				}
			}
			for(int i=0;i<arr.length;i++) {
				System.out.println("inside the class : "+(i+1));
			
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("Enter the student no: "+(j+1)+" is "+arr[i][j]);
				

				}
			}
		}

	}



