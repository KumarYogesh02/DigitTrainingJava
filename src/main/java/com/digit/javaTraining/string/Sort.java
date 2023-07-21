package com.digit.javaTraining.string;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Sort {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
//	int arr[]= {12,43,4,32,21};
	int arr1[]=new int[n];
	for(int i=0;i<n;i++) {
		
	 arr1[i]= sc.nextInt();
		
	}
	
		Arrays.sort(arr1);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		System.out.println(arr1[arr1.length-2]);
	}

}
