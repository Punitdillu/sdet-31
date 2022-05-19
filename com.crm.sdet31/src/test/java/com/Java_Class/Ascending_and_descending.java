package com.Java_Class;

public class Ascending_and_descending {

		public static void main(String[] args) {
			
			int a[]= {2,7,5,9,1};
			int b[]=new int[a.length];
			
			for(int i=0;i<a.length;i++) {
				int count=0;

				for(int j=0;j<a.length;j++) {
					
						if(a[i]<a[j]) {
							
							count++;
						}
						
					}
					b[a.length-1-count]=a[i];
					
				}
			for(int i=0;i<a.length;i++) {
				
				System.out.println(b[i]);
			}
			
		}
		}
