package com.reverse_String;

import javax.swing.text.AbstractDocument.LeafElement;

public class PrintSubstring {
	public static void main(ReverseString[] args) {
		
		String s="redyellowgreenredyellow";
		
			String s1="low";
			int l=s1.length()-1;
			
			System.out.println(l);
			int count=0;
			for(int i=0;i<s.length()-l;i++) {
				
				String a=s.substring(i,i+l+1);
				
						if(a.equals(s1)) {
							count++;
						}
					
				}System.out.println(count);
			
		
		
	}

}
