package com.section1_javacode;

public class StrongNumber {

	public static void main(String[] args) {
		int num=145;
		int temp=num;
		int sum=0;
		while(temp>0) {
			
			int r=0;
			int k=1;
			
			r=temp%10;
			int count=r;
			for(int i=1;i<=count;i++) {
				k=k*r;
				r--;
			}
			sum=sum+k;
			temp=temp/10;
		}
		System.out.println(sum);
		if(sum==num) {
			System.out.println("number is strong number");
		}
	}
}
