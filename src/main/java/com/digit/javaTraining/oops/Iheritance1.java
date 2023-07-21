package com.digit.javaTraining.oops;


class Animals1{
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
class monkey1 extends Animals1{
	@Override
	void eats() {
		System.out.println("They eat lot for health ");
	}

	@Override
	void fight() {
		System.out.println("Monkey have fight each other");
	}
	@Override
	void sleep() {
		System.out.println("Animal have sleep");
	}


}
class sumit1 extends Animals1{
	@Override
	void sleep() {
		System.out.println("Sumit sleeps too much");
	}
	@Override
	void fight() {
		System.out.println("Fight friend each other");
	}
	@Override
	void eats() {
		System.out.println("He eats lot ");
	}

}
class cats1 extends Animals1{
	void nature() {
		System.out.println("Cat are calm in nature");
	}
	@Override
	void sleep() {
		System.out.println("cat sleeps too much");
	}
	@Override
	void fight() {
		System.out.println("Fight each other");
	}
	@Override
	void eats() {
		System.out.println("He eats less ");
	}


}

class forest{
	void perm(Animals1 an) {
		an.eats();
		an.sleep();
		an.fight();
	}
}

//down casting=parent behave like child
public class Iheritance1 {
	public static void main(String[] args) {
		//	Animals an; //making a reference of parent class
		forest f = new forest();
		monkey1 m= new monkey1();
		f.perm(m);


		cats1 c = new cats1();
		f.perm(c);
		c.nature();

		sumit1 s = new sumit1();
		f.perm(s);

	}


}



