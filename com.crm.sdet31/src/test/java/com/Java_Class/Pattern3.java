package com.Java_Class;

public class Pattern3 {
	public static void main(String[] args) {
		
	
	int count=1;
	int space=8;
	int row=9;
	
	
	for(int i=1;i<=row;i++) {
		
		for(int j=1;j<=space;j++) {
			
			System.out.print(" ");
			}
		for(int k=1;k<=count;k++) {
			
			System.out.print("*");
			System.out.print(" ");
			
		}
		if(i<5) { 
		count+=2;
		space-=2;}
		
		else {
			count-=2;
			space+=2;
		}
		
		System.out.println();
	}

}}
