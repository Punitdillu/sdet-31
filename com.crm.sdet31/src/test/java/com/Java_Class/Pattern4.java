package com.Java_Class;

public class Pattern4 {

		public static void main(String[] args) {
			
			int space=4;
			int count=1;
			int row=5;
			
			for(int i=1;i<=row;i++) {
			char ch='A';
				for( int j=1;j<=space;j++) {
					
					System.out.print("  ");
				}
				for(int k=1;k<=count;k++) {
					
				if(k<i) {
					System.out.print(ch+" ");
					ch++;
				}
				else {
					System.out.print(ch+" ");
					ch--;
				}
				
				}
					
				count+=2;
				space--;
				System.out.println();
			}
		}
}
