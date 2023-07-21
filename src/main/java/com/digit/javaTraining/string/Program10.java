package com.digit.javaTraining.string;

import java.util.Scanner;

public class Program10{

public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter th statement");
	String s1=sc.nextLine();
	String s2=s1.toLowerCase();
	
	

	for(int j=0;j<s2.length();j++) {
		if(s2.charAt(j)=='a') {
			s2=s2+'$';
			
		}
		
		else if(s2.charAt(j)=='e') {
			s2=s2+'#';
				
			}
		else if(s2.charAt(j)=='i') {
			s2=s2+'@';
			
		}else if(s2.charAt(j)=='o') {
			s2=s2+'&';
			
		}else if(s2.charAt(j)=='u') {
			s2=s2+'^';
			
		}
		

}
	System.out.println(s2);
}
}
