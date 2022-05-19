package com.Java_Class;

public class Firstmax_And_Secondmax_inArray {

		public static void main(String[] args) {
			
			int a[]= {9,9,1,8,6,9,4,0,3,9,9,9,9,8,8};
			int fmax=a[0];
			int smax=5;
			
			for (int i = 0; i < a.length; i++) {
				
					if(a[i]>fmax) {
						
		smax=fmax;
						fmax=a[i];
					}
					else if(a[i]>smax && a[i]!=fmax) {
						 
							
							smax=a[i];
						
					}
			}
			System.out.println(fmax+"  "+smax);
			
		}
}
