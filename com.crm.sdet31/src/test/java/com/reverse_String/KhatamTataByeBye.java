package com.reverse_String;

import java.util.LinkedHashSet;

public class KhatamTataByeBye {

	public static void main(ReverseString[] args) {
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		String s="khatam ta ta bye bye";
		String[]a=s.split(" ");
		
		for(int i=0;i<a.length;i++) {
			
			hs.add(a[i]);
		}
		for (String string : hs) {
			int count=0;
			
			for( int i=0;i<a.length;i++) {
				
				if(string.equals(a[i])) {
					count++;
				}
			}
			if(count>0)
			System.out.println(string+" present "+count+" times");
		}

	}
}
