package com.Java_Class;

public class Array_11110000 {
	public static void main(String[] args) {
		
		int a[]= {1,0,1,0,0,1,0,1};
		int b[]=new int[a.length];
		int d=0;
		int c=(a.length-1);
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==0) {
				
				b[c]=a[i];
				c--;
			}
			else  {
				b[d]=a[i];
				d++;
			}
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(b[i]);
		}
		
		
			
		}
	}


