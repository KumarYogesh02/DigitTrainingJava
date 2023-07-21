package com.digit.javaTraining.basicPatterns;

public class PatternA {
	public static void main(String[] args) {
		int n=5;
		int count=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j%2==0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.print("   ");
			
			for(int j=0;j<n;j++) {
				if(i%2==0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}
			
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i-j==0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}
			
			System.out.print("   ");
			
			for(int j=0;j<n;j++) {
			
				
				if(count<10) {
					System.out.print("0"+ count+++" ");
				}
				else {
					System.out.print( count+++" ");
				}
				
				
			}
			
			System.out.print("   ");

			for(int j=0;j<n;j++) {
			
				
				if(((i+1)+j*5)<10) {
					System.out.print("0");
					System.out.print((i+1)+j*5+" ");
				}
				else {
					System.out.print( (i+1)+j*5 +" ");
				}
				
				
			}
			
			
			System.out.println();
			
		}
		
	}
	

}
