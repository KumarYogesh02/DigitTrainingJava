package com.digit.javaTraining.oops;
abstract class plain{
	
	void takeOff() {
		
		System.out.println("palin take off");
	}
	abstract void fly() ;
}
class CargoPlain extends plain{
	@Override
	void fly() {
		System.out.println("plain fly at low height");
		
	}
	
}

public class FinalStates {
	public static void main(String[] args) {
		final String Plane_Name="flying jet";
	
		
		CargoPlain cp= new CargoPlain();
		cp.takeOff();
		cp.fly();
	}
	

}
