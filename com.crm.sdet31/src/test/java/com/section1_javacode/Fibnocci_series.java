package com.section1_javacode;

public class Fibnocci_series {
	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int n3;
		//System.out.print(n1+" ");
		//System.out.print(n2+" ");
		 for(int i=1;i<=20;i++) {
			 
			 //n3=n1+n2;
			 
			 System.out.print(n1+" ");
			 n3=n1+n2;
			 n1=n2;
			 n2=n3;
		 }
	}

}
