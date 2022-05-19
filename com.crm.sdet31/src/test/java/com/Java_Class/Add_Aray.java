package com.Java_Class;

import java.util.Iterator;

public class Add_Aray {
	public static void main(String[] args) {
		
		int a[]= {1,2,3};
		int b[]= {9,9,20};
		int c[]= {8,8,8};
		for (int i = 0; i < b.length; i++) {
			int x=a[i]+b[i]+c[i];
			//System.out.print(x=a[i]+b[i]);
			int q=0;
			int r=0;
			q=x%10;
			r=x/10;
			System.out.print(r+" "+q+" ");
		}
	}

}
