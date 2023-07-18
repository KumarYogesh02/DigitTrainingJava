package com.digit.test.proj.p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exp1 {
	
	try
	//try with resource try(Scanner sc= new Scanner(System.in))
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Division Operation");
		System.out.println("Enter the numerator");
		int num= sc.nextInt();
		System.out.println("Enter the denominator");
		int den = sc.nextInt();
		
		int res=num/den;
		System.out.println("Divison result is:"+res);
		
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		int arr1[]=null;
		
		System.out.println("Enter the position to which value has to be added");
		int pos=sc.nextInt();
		System.out.println("Enter the value to added in the position");
		int val=sc.nextInt();
		
		arr[pos]=val;
		System.out.println("Data added into the array");
	}
	//Multiple catches
//	catch (ArithmeticException e1) {
//		System.out.println("ArithmeticException");
//		
//	}
//	catch(NegativeArraySizeException e2) {
//		System.out.println("NegativeArraySizeException");
//		
//	}
//	catch(ArrayIndexOutOfBoundsException e3) {
//		System.out.println("ArrayIndexOutOfBoundsException");
//		
//	}
//	catch(InputMismatchException e4) {
//		System.out.println("InputMismatchException");
//		
//	}
//	catch(NullPointerException e5) {
//		System.out.println("NullPointerException");
//		
//	}
	//Multi catch
	
	catch (ArithmeticException e1) {
		System.out.println("ArithmeticException");
		
	}
	catch(NegativeArraySizeException |InputMismatchException e4) {
		System.out.println("Input Related Exception");
		
	}
	catch(ArrayIndexOutOfBoundsException|NullPointerException e3) {
		System.out.println("Array Related Exception");
		
	}
	

}
