package com.Java_Class;

public class A_1_2_3 {

	public static void main(String[] args) {
		
		int num=123456;
		String intstring = Integer.toString(num);
		System.out.println(intstring);
		int a[]=new int[intstring.length()];
		for(int i=0;i<intstring.length();i++) {
			a[i]=intstring.charAt(i)-'0';
		}
		
//	int a[]= {1,2,3};
		int n=1;
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				
				System.out.print((a[j]*n)+" ");
				
			}
			n=n*10+1;
			System.out.println();
		}
		
		}
	}

