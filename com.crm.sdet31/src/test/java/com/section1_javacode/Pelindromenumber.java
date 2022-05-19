package com.section1_javacode;

public class Pelindromenumber {

		public static void main(String[] args) {
			
			int temp=111;
			int n=temp;
			int sum=0;
			while(n>0) {
				
				int r=0;
				r=n%10;
				sum=sum*10+r;
				n=n/10;
			}
			if(sum==temp) 
			{
				System.out.println("number is pelindrome");
			}
		}
}
