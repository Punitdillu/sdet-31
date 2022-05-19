package com.Java_Class;

public class Minimum_without_two_loops {

	public static void main(String[] args) {
		
		int a[]= {4,5,1,2,9};
		int f=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<f) {
				
				f=a[i];
			}
		}
		System.out.println(f);
	}
}
