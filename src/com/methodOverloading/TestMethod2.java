package com.methodOverloading;

public class TestMethod2 {
	
	void method(String s1) {
		method(s1,s1+s1);
	}
	void method(String s1,String s2) {
		method(s1,s2,s1+s2);
	}
	
	void method(String s1, String s2,String s3) {
		System.out.println(s1+s2+s3);
	}
	

	public static void main(String[] args) {
		TestMethod2 one = new TestMethod2();
		one.method("Java");
	}

}
