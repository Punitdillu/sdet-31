package com.patternprograms;

public class DownAndUpTraingle {

		public static void main(String[] args) {
			
		int row=3;
		int count=5;
		int space=0;
		for(int i=1;i<=row;i++) {
			
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			
			for(int j=count;j>=1;j--) {
				
				System.out.print("*");
			}
			System.out.println();
			
			space++;
			count-=2;}
		
		int row1=3;
		int count1=1;
		int space1=2;
		for(int i=1;i<=row1;i++) {
			
			for(int k=space1;k>=1;k--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=count1;j++) {
				
				System.out.print("*");
			}
			System.out.println();
			
			space1--;
			count1+=2;}
			
		}
}
