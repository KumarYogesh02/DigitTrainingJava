package com.digit.javaTraining.arrayProgram;

import java.util.Scanner;

public class JaggadArray2 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of school");
		int sch = sc.nextInt();
		System.out.println("Enter the count of the classes");
		int cls = sc.nextInt();
		System.out.println("Enter the count of students");
		int stu = sc.nextInt();

		


		String arr[][][]= new String [sch][cls][stu];
		
		
	
		
		for(int i=0;i<sch;i++) {
			System.out.println("inside the name schoool : "+(i+1));
		
			for(int j=0;j<cls;j++) {
				System.out.println("Enter the class no: "+(j+1)+" is ");
				for(int k=0;k<stu;k++) {
					System.out.println("Enter the name student no : "+(k+1)+" Is:");
					arr[i][j][k]=sc.next();
				}

			}
		}
		for(int i=0;i<sch;i++) {
			System.out.println("inside the schoool : "+(i+1));
		
			for(int j=0;j<cls;j++) {
				System.out.println("Enter the class no: "+(j+1)+" is ");
				for(int k=0;k<stu;k++) {
					System.out.println("Enter the student no : "+(k+1)+" Is:" + arr[i][j][k]);
					
				}

			}
		}
			

			}
		}


