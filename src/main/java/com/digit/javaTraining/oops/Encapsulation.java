package com.digit.javaTraining.oops;

class Crickete{
	private String name;
	private String country;
	private int renumeration;
	private int exp;
	// Generic Setter
	void setData(String name, String country, int renumeration, int exp) {
	this.name =name;//Shadowing problem = when compiler is under the confusion in differentiate between the instance variable
	//and local variable. so overcome this problem we use 'this' keyword.
	this.country=country;
	this.renumeration=renumeration;
	this.exp=exp;
	}
	//Generic getter
	void getData() {
		System.out.println(name);
		System.out.println(country);
		System.out.println(renumeration);
		System.out.println(exp);
	}
	
	
	//specific setter
	void setName(String name) {
		this.name=name;
	}
	void setcountry(String contry) {
		this.country=country;
	}
	void setrenumeration(int renumeration) {
		this.renumeration=renumeration;
	}
	void setExp(int exp) {
		this.exp = exp;
	}
	//specific getter
	void getName() {
		System.out.println( name);
	
	}
	void getcountry() {
		System.out.println( country);
	}
	void getRenumeration() {
		System.out.println( renumeration);
	}
	void getExp() {
		System.out.println( exp);
	}
	
	
}
class cat{
	private String name;
	private String breed;
	
	public void getName() {
		 System.out.println(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void getBreed() {
		System.out.println(breed);
	}
	
}


public class Encapsulation {
	public static void main(String[] args) {
		Crickete c=new Crickete();
		c.setData("Sachin","India",20000,25);
		c.getData();
		Crickete c1= new Crickete();
			c1.setName("Kholi");
			
			c1.setrenumeration(20000);
			c1.getRenumeration();
			c1.getName();
		cat t= new cat();
		t.setName("meow meow");
		t.setBreed("siamese");
		t.getBreed();
		t.getName();
		
	}

	

}
