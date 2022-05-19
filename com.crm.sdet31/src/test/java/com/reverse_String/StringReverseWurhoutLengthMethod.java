package com.reverse_String;

public class StringReverseWurhoutLengthMethod {
	
public static void main(ReverseString[] args) {
		
		String s="123321";
		char[] s1 = s.toCharArray();
		int count=0;
		String rev="";
		
		for (char c : s1) {
			count++;
		}
		for(int i=count-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
			
			
		}
		System.out.println(rev);
		
		if(rev.equals(s)) {
			
			System.out.println( s+" is pelindrome");}
			else {
				System.out.println( s+" is not pelindrome");
			}		
	}

}
