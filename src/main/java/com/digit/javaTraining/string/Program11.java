package com.digit.javaTraining.string;

import java.util.Scanner;

public class Program11 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter th statement");
		String str1=sc.nextLine();
		int spc_cnt=0;
		String str2="";
		int temp=0;

		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)==' ') {
				spc_cnt++;

			}
		}
		String arr[]=new String[spc_cnt+1];
		for(int i=str1.length()-1;i>=0;i--) {
			if(str1.charAt(i)==' ') {
				arr[temp]=str2;
				str2="";
				temp++;
			}else {
				str2=str2+str1.charAt(i);
			}
		}
		arr[temp]=str2;
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			
		}

	}
}


