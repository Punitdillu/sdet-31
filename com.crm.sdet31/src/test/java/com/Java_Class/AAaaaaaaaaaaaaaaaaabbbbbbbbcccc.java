package com.Java_Class;

public class AAaaaaaaaaaaaaaaaaabbbbbbbbcccc {

	public static void main(String[] args) {
		
		String s="aabbbcca";
		
		for (int i = 0; i <s.length(); i++) {
			
			int count=0;
			for (int j =i; j < s.length(); j++) {
			
				if(s.charAt(i)==s.charAt(j)) {
					
					count++;
				}
				else {
				i=j-1;
					break;
				}
				}
			if(count>0) {
			System.out.print(s.charAt(i)+""+count);}
			
			}
	}
}
