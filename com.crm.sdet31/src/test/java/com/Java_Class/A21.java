package com.Java_Class;

import org.testng.annotations.Test;

public class A21 {
	@Test( priority = 1,dependsOnMethods = "m3" )
	public void m1(){
		
		System.out.println("m1 running");
	}
	
	@Test(priority = 3)
	public void m2(){
		
		System.out.println("m2 running");
	}
	
	@Test(priority = 2)
	public void m3(){
		
		System.out.println("m3 running");
	}
	@Test(priority = -1,dependsOnMethods = "m1")
	public void m4(){
		
		System.out.println("m4 running");
	}
	@Test(dependsOnMethods = "m4")
	public void m5(){
		
		System.out.println("m5 running");
	}
	@Test(dependsOnMethods = "m3" )
	public void m6(){
		
		System.out.println("m6 running");
	}

		
}
