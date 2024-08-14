package com.methodOverloading;

public class TestMethod {
	static void add(int a, double d) {
		System.out.println("Argument type (int , double)");	
	}
	static void add(double d, int a) {
		System.out.println("Argument type (double , int)");
	}
	static void add(double d, double a) {
		System.out.println("Argument type (double , double)");
	}
	static void add(int a, float f) {
		System.out.println("Argument type (int , float)");
	}
	static void add(float f, int a) {
		System.out.println("Argument type (int , float)");
	}
	public static void main(String[] args) {
		add(3.0,5.0);
		add(2,5.4f);
	}
}
