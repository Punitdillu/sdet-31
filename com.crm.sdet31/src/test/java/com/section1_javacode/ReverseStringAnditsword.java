package com.section1_javacode;

public class ReverseStringAnditsword {
	public static void main(String[] args) {
		
		String s[]= {"my","name","is","punit"};
		String b[]=new String[s.length];
		int n=b.length-1;
		for(int i=0;i<s.length;i++) {
			b[n]=s[i];
			n--;
		}
//		for (int i = 0; i < b.length; i++) {
//			
//		System.out.print(b[i]+" ");
//		}
//		System.out.println();
		
		for (String string : b) {
			
			String rev="";
			for(int i=string.length()-1;i>=0;i--) {
				rev=rev+string.charAt(i);
				
			}System.out.print(rev+" ");
		}
	}
}
