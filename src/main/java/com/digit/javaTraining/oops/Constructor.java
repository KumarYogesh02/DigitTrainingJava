package com.digit.javaTraining.oops;

class cricketer{
	private String name;
	private int exp;
	private String country;
	private int renumeration;
	
	cricketer(){
		this("virat");
	
	}cricketer(String name){
		this("virat",20);
		this.name="virat";
	
	}cricketer(String name,int exp){
		this("virat",20,"India");
		this.name="virat";
		this.exp=20;
	
	}cricketer(String name,int exp, String country){
		this("virat",20,"India",20000);
		this.name="virat";
		this.exp=20;
		this.country="India";
	
	}cricketer(String name,int exp,String country,int renumeration){

		this.name="virat";
		this.exp=20;
		this.country="India";
		this.renumeration=20000;
	
	}
	


	void getData() {
		System.out.println(name);
		System.out.println(exp);
		System.out.println(country);
		System.out.println(renumeration);
	}
}
//class Dog{
//	private String name;
//	private String color;
//	private int age;
//	Dog(){
//		name="rocky";
//		color="white";
//		age=3;
//	}
//	Dog(String name){
//	//	this();
//		this.name=name;
//	}
//	void getData() {
//		System.out.println(name);
//		System.out.println(color);
//		System.out.println(age);
//	}
//}

public class Constructor {
	public static void main(String[] args) {
		cricketer d1= new cricketer();
		d1.getData();
	}
	

}
