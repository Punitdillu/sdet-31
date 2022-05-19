package com.Java_Class;

public class Array_key_display {

		public static void main(String[] args) {
			
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int key=8;
		int size=key;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>=key) {
				
				System.out.print(a[i]+" ");
			}
			
			}
		for(int i=1;i<size;i++) {
			System.out.print(i+" ");
		}
		
		
}}
