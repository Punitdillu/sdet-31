package com.Java_Class;

public class OccuranceofNumber {
	public static void main(String[] args) {
		
		int arr[]= {1,2,1,4,3,5,8,7,8,5};
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i]==arr[j] ) {
					if(i>j) {
				
					break;}
					else {
						count++;
					}
				
				 
			}}
			if(count>=1)
			{
			 System.out.println(arr[i]+" is present "+count+" times");
			}
			
		
		}	
		
		
	}}


