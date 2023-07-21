package com.digit.javaTraining.string;

import java.util.Scanner;


public class Add_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.nextLine() ;
		int count=0;
		int k=0;
		for(int i=0;i<s1.length();i++) {
			count= count+s1.charAt(i);
		}
		System.out.println(count);
		
		for(int i=2;i<count;i++) {
			if(count%i==0) {
				k=1;
			}
		}
		if(k==1) {
			System.out.println("Not Prime");
		}
		else
			System.out.println("prime");
		
		
	}
	

}
