package com.Java_Class;


public class Pattern_recursion {
	
	public static void m1() {
		int count=1;
		for(int i=1;i<=count;i++) {
			System.out.print("*");
			count++;
			
			if (count<=5) {
				m1();
				
		}
			else{
			break;	
			}
			}
		
		
	}
	public static void main(String[] args) {
		
		m1();
		
			
		
	}

}
