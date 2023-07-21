package com.digit.javaTraining.oops;

import java.util.Scanner;

class empl{
	static float ctc;
	static String DateOfJoining;
	static int pf;
	String a;
	

static {
	ctc =4.5f;
	DateOfJoining="22 june 2023";
	pf=1500;
	
}
void getData() {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the which you want to know detail");
	a=s.next();
	
}
void display() {
	System.out.println(a+" Ctc is: "+ctc);
	System.out.println(a+" DateOfJoining is: "+DateOfJoining);
	System.out.println(a+" pf cutted is : "+pf);
}
}
public class StaticWork {
	public static void main(String[] args) {
	empl e= new empl();
	e.getData();
	e.display();
	}
	

}
