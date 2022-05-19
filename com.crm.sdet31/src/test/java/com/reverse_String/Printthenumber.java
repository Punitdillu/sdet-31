package com.reverse_String;

public class Printthenumber {

		public static void main(ReverseString[] args) {
			
			int a[]= {2,1,8,11};
			try {
			for(int i=0;i<a.length;i++) {
				int num=a[i]+1;
				
				if(a[i]<a[i+1]) {
					for(int j=0;j<=a[i+1];j++) {
						
					System.out.print(num++ +" ");
					if(num==a[i+1]) {
						break;
					}
					
					}
					
				}
			}}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
}
