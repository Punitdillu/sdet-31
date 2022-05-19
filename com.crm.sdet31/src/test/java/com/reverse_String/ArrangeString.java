package com.reverse_String;

public class ArrangeString {

	public static void main(ReverseString[] args) {
		
		String s="@a@bc$d$$$ab@cdabcd";
		
		for(int i=0;i<s.length();i++) {
			
			for(int j=0;j<s.length();j++) {
			
			if(s.charAt(i)==s.charAt(j)&& i>j ) {
				
				
				break;
			}
			else if(s.charAt(i)==s.charAt(j) ) {
				System.out.print(s.charAt(i));
			}
			}
			System.out.print(" ");
		}
	}
}
