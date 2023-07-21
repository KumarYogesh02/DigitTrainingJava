package com.digit.javaTraining.oops;

interface calculate{
	int a=10;
	void add();
	void sub();
	default void div() {
		System.out.println("div from interface class");
	}
	static void mul() {
		System.out.println("mul from interface class");
	}
}

public class Interface1 {
	public static void main(String[] args) {
		calculate c = new calculate() {
			
			@Override
			public void add() {
				// TODO Auto-generated method stub
				System.out.println("add from annonymus inner type");
				
			}
			@Override
			public void sub() {
				// TODO Auto-generated method stub
				System.out.println("sub from annonymus inner type");
				
			}
		};
		c.add();
		c.sub();
		c.div();
		calculate.mul();
		System.out.println(c.a);
		
	}

}
