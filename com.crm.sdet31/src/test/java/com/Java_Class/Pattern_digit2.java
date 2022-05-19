package com.Java_Class;

public class Pattern_digit2 {

	public static void main(String[] args) {
		
		int m=4;
		int c=0;
		for(int i=1;i<=5;i++)
		{
			c=i;
		int y=0;
			for(int j=1;j<=i;j++) {
				
				System.out.print(c+" ");
				c+=m-y;
				y++;
				}
			System.out.println();
		}
	}
}
