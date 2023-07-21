package com.digit.javaTraining.arrayProgram;

import java.util.Scanner;

public class Jaggad4d {

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the number of University");
			int  uni = sc.nextInt();



			String arr[][][][]=new String [uni][][][];

			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter the school no: "+(i+1)+"Name:");
				int sch = sc.nextInt();
				arr[i] =new String[sch][][];


				for(int j=0;j<arr[i].length;j++) {
					System.out.println("Enter the class no: "+(j+1)+"Name:");
					int cls = sc.nextInt();
					arr[i][j] =new String[cls][];

					for(int k=0;k<arr[i][j].length;k++) {
						System.out.println("Enter the student no: "+(k+1)+"Name:");
						int stu = sc.nextInt();
						arr[i][j][k] =new String[stu];

					}
				}
			}





		for(int i=0;i<arr.length;i++) {
			System.out.println("inside the name university : "+(i+1));

			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the school no: "+(j+1)+" is ");
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name class no : "+(k+1)+" Is:");

					for(int l=0;l<arr[i][j][k].length;l++) {
						System.out.println("Enter the name student no : "+(l+1)+" Is:");

						arr[i][j][k][l]=sc.next();

					}

				}

			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside the name schoool : "+(i+1));

			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the class no: "+(j+1)+" is ");
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name student no : "+(k+1)+" Is:");
					for(int l=0;l<arr[i][j][k].length;l++) {
						System.out.println("Enter the name student no : "+(l+1)+" Is:"+arr[i][j][k][l]);



					}
				}

			}
		}	


	}
}
