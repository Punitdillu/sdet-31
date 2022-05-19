package com.reverse_String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Ocuurance_of_character {
	public static void main(ReverseString[] args) {
		
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
	String s="Mahabharat";
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch1=s.charAt(i);
			hs.add(ch1);
		
		//System.out.println(hs);
		}
		//System.out.println(hs);
		for (Character character : hs) {
			int count=0;
			int i=0;
			for ( i = 0; i < s.length(); i++) {
			
		if(character==s.charAt(i)) {
			count++;
		}
		}
			if(count>1) {
				
		System.out.println(character+" position is "+s.indexOf(character));	
		}
		}
	}
	}


