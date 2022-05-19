package com.Array_Practice;

public class Swap_with_third_variable {
	
	public static void main(String[] args) {
		
		int a=2;
		int b=3;
		int c=4;
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a);
//		System.out.println(b);

		
		a=a+b+c;//9
		
		b=a-(b+c);
		System.out.println("b: "+b);
		c=a-(b+c);
		System.out.println("c: "+c);
		a=a-(b+c);
		System.out.println("a: "+a);
		
		
	
}
}
