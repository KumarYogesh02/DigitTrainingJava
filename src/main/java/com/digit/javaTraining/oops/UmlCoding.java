package com.digit.javaTraining.oops;

import java.util.Scanner;

abstract class shapes{
	float area;
	abstract void getData();
	abstract void calculate();
	void display() {
		System.out.println(area);
	}
}
	class circle extends shapes{
		private static float pi=3.14f;
		private int r;
		
		public static float getPi() {
			return pi;
		}
		public static void setPi(float pi) {
			circle.pi = pi;
		}
		public int getR() {
			return r;
		}
		public void setR(int r) {
			this.r = r;
		}
		@Override
		void getData() {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the radius");
			r= sc.nextInt();
		}
		@Override
		void calculate() {
			System.out.println("Area of circle is");
			area= pi*r*r;
		}
	}
	class square extends shapes{
		private int side;
		@Override
		void getData() {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the side");
			side= sc.nextInt();
		}
		@Override
		void calculate() {
			System.out.println("Area of square is");
			area= side *side;
		}
		
	}
	class Rectangle extends shapes{
		private int l;
		private int b;
		@Override
		void getData() {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the length");
			l= sc.nextInt();
			System.out.println("Enter the breath");
			b= sc.nextInt();
		}
		@Override
		void calculate() {
			System.out.println("Area of square is");
			area= l *b;
		}
		
	}
	class geometry{
		void used_shape(shapes s) {
			s.getData();
			s.calculate();
			s.display();
		}
	}
public class UmlCoding {
public static void main(String[] args) {
	geometry g= new geometry();
	Rectangle r= new Rectangle();
	square s= new square();
	circle c= new circle();
	g.used_shape(r);
	g.used_shape(s);
	g.used_shape(c);
	
}
}
