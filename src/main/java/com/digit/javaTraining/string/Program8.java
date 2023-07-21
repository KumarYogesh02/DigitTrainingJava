package com.digit.javaTraining.string;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter th statement");
		String s1=sc.nextLine();
		String s2="";
		
		for(int j=0;j<s1.length();j++) {
			
				if (s1.charAt(j)==' ' && s1.charAt(j+1)==' ') {
					
					s1.replaceAll(" ", "");
					
				}
				else
				{
					s2=s2+s1;
				}
		
				
			}
			
	
		System.out.println(s2);

}
}
