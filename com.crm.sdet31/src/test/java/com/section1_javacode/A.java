package com.section1_javacode;

public class A {
	
	private  class B{
		
		public void m1(){
			System.out.println("mi running");
		}
	}
	public void m2() {
		B b=new B();
		b.m1();
	}

}
class Chasma{
	
	public static void main(String[] args) {
		
		A a=new A();
		a.m2();
	}
}
