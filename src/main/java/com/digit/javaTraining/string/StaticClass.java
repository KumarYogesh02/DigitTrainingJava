package com.digit.javaTraining.string;

public class StaticClass {
	int a,b,c;
	static int m,n,o;
	//static block
	static {
//		a=10;//Non static variable cannot be accessed by static number
//		b=23;//Non static variable cannot be accessed by static number
		m=100;
		n=200;
		o=300;
	}
	//non static it will automatically executed after object creation
	{
		a=10;
		b=12;
		c=17;
		m=4;
		n=0;
		o=88;
	}
	static void get (){
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
		
		
	}
	void get2() {
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		System.out.println(StaticClass.m);
		System.out.println(StaticClass.n);
		System.out.println(StaticClass.o);
		StaticClass.get();
		StaticClass sta= new StaticClass();
		sta.get();
	}

}
