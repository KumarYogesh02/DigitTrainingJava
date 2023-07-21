package com.digit.javaTraining.oops;
class claculator{
	int add(int a , int b) {
		return a+b;
	}
	float add(float a , float b) {
		return a+b;
	}
	double add(double a , double b) {
		return a+b;
	}
	double add(int a , int b,double c) {
		return a+b+c;
	}
	float add(int a , float b) {
		return a+b;
	}
	double add(int a , float b,double c) {
		return a+b+c;
	}
	float add(float a, int b) {
		return a+b;
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		claculator c = new claculator();
		int a=10, b=20 , d=49 ;
		float m=39.44f, n=38.44f ,o=37.7f;
		double p=44.333 ,q=339.4 ,r=200.444;
		System.out.println(c.add(a, m));
		System.out.println(c.add(n, m));
		System.out.println(c.add(a,b, p));
		System.out.println(c.add(a, m,p));
		
	}
	

}
