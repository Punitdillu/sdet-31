package com.section1_javacode;

import java.util.LinkedHashSet;

public class Tester {
	public static void main(String[] args) {
		
		String s="Tester";
		s=s.toLowerCase();
		LinkedHashSet<Character> lhs=new LinkedHashSet<>();
		
		for(int i=0;i<s.length();i++) {
			lhs.add(s.charAt(i));
		}
		for (Character character : lhs) {
			for(int i=s.length()-1;i>=0;i--) {
				if(character==s.charAt(i)) {
					System.out.println(character+" "+(i+1));
					break;
				}
			}
		}
	}

}
