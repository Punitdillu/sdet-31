package com.Java_Class;

public class A_inhertence {
	
	public void m1() {
		
		System.out.println("hello");
	}
	

}

 class B extends A_inhertence{
	
	public void m1() {
		
		System.out.println("hii");
	}
	
	public void run() {
		System.out.println("run");
	}
		
	
}

 class C extends B{
	
	public void m1() {
		
			System.out.println("bye");
	}
	public void book() {
		System.out.println("book");
	}
	public static void main(String[] args) {
		
		A_inhertence a=new C();
		a.m1();
		C c=(C)a;
		c.book();
		
		
		
	}
	
}
