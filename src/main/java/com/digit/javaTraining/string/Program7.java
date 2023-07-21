package com.digit.javaTraining.string;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter th statement");
		String s1=sc.nextLine();
		int count_num=1;
		String s2="";
		for(int j=0;j<s1.length();j++) {
			
				if (s1.charAt(j)==32) {
					count_num++;
				}
			}
			
	
		System.out.println(count_num);

}
}
