package com.Java_Class;

public class Bubble_add_last_three_number {

		public static void main(String[] args) {
			
			
			int arr[]={2,5,6,8,6,12};
			for (int i=0;i<arr.length;i++) {
				
				for(int j=i+1;j<arr.length;j++) {
					
					if(arr[i]<arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			int sum=0;
			for(int i=0;i<3;i++) {			
				sum=sum+arr[i];
			}
			System.out.println(sum);

}}
