package com.Array_Practice;

public class Bubble_shorting_ascending {

		public static void main(String[] args) {
			
		
		int a[]= {1,2,1,3,5,2,7,10,9};
		
		for(int i=0;i<a.length;i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]+" ");
			System.out.println(" ");
		
		}
}}
