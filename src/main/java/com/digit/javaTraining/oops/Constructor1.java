package com.digit.javaTraining.oops;
class Animal{
	String name;
	String name1;
	
	Animal(String name){
		this.name=name;
		System.out.println("Hi papa speaking from animals");
		System.out.println(name);
		
	}
	
	
}
class dog extends Animal{
	dog(String name1){
		super("carnivorse");
		System.out.println("hi this is bachha from dog side");
		this.name1=name1;
		System.out.println(name1);
		System.out.println("Hi this is bachha from sheep side");
	}
}
public class Constructor1 {
	public static void main(String[] args) {
		dog d=new dog("Harbivorse");
	}
	

}
