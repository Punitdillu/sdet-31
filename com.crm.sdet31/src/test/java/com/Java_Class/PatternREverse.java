package com.Java_Class;

public class PatternREverse {
	public static void main(String[] args) {
		
		int row=5;
		int count=5;
		int space=0;
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=space;j++) {
				
				System.out.print(" ");
			}
				for(int k=1;k<=count;k++) {
				
				System.out.print("*");
			}
				count--;
				space++;
				System.out.println();
		}
	}

}
