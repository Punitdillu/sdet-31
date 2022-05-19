package com.Java_Class;

public class Maximumnumber_withoutusing_twoloops {

		public static void main(String[] args) {
			
			int a[]= {4,5,1,2,9};
			int fmax=a[0];
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>fmax) {
					
					fmax=a[i];
				}
			}
			System.out.println(fmax);
		}
		
}
