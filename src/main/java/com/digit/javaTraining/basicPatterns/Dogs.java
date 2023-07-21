package com.digit.javaTraining.basicPatterns;

class Dog {
	String name;
	int age;
	String breed;
	void run() {
		System.out.println("Dog run");
	}
	void eat(){
		System.out.println("Dog eats");
	}

}
public class Dogs{
	public static void main(String[] args) {
		Dog d1=new Dog();
//		d1.name="Rocky";
//		d1.age=3;
//		d1.breed="Gr";
		System.out.println(d1.name);
		System.out.println(d1.age);
		System.out.println(d1.breed);
		d1.run();
		d1.eat();
	}
}
