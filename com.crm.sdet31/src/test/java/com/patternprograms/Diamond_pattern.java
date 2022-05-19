package com.patternprograms;

public class Diamond_pattern {
	public static void main(String[] args) {
		
		int row=9;
		int count=1;
		int space=4;
		for(int i=1;i<=row;i++) {
			
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			
			for(int j=count;j>=1;j--) {
				
				System.out.print("*");
			}
			System.out.println();
			if(i<5) {
			space--;
			count+=2;}
			
			else
				{
				space++;
				count-=2;
				}
				}
	}

}
