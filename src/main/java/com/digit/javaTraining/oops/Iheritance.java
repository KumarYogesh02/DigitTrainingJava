package com.digit.javaTraining.oops;
class Animals{
	void walk() {
		System.out.println("Walk on four or two feet");
		
	}
	void eats () {
		System.out.println("Animals have eat");
	}
	void sleep() {
		System.out.println("Animal have sleep");
	}
	void fight() {
		System.out.println("They have fight each other");
	}
	
}
class monkey extends Animals{
	@Override
	void walk() {
		System.out.println("They walk on two feet");
	}
	
	@Override
	void fight() {
		System.out.println("Monkey have fight each other");
	}

	
}
class sumit extends monkey{
	@Override
	void sleep() {
		System.out.println("Sumit sleeps too much");
	}
	@Override
	void fight() {
		System.out.println("Fight friend each other");
	}
	
}
class cats extends sumit{
	void nature() {
		System.out.println("Cat are calm in nature");
	}
	
}
//down casting=parent behave like child
public class Iheritance {
	public static void main(String[] args) {
	//	Animals an; //making a reference of parent class
		Animals an;
		
		cats c= new cats();
		
		c.sleep();
		c.fight();
		c.nature();
		c.walk();
		
	
	}
	

}
