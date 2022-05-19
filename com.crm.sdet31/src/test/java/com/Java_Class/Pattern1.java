package com.Java_Class;

public class Pattern1 {
	public static void main(String[] args) {
		
		int space=1;
		int count=5;
		int row=5;
		for(int i=row;i>=1;i--) {
		
			for(int j=space;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=count;k>=1;k--) {
				
				System.out.print("*"+" ");
			}
			space++;
			count--;
			System.out.println();
		}
	}

}
