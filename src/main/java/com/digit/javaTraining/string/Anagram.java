package com.digit.javaTraining.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string 1 ");
		String s1= sc.next();
		System.out.println("Enter the string 2 ");
		String s2=sc.next();
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		for (int i=0;i<c1.length;i++) {
			if(c1[i]!=c2[i]) {
				System.out.println("So not anagram");
				System.exit(0);
			}
			
			
		}
		System.out.println("It is anagram");
		
		
		
	}

}
