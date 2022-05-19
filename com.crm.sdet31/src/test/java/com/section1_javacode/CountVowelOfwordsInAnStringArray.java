package com.section1_javacode;

import java.util.LinkedHashSet;

public class CountVowelOfwordsInAnStringArray {
	public static void main(String[] args) {
		
		String a[]= {"hi","hello","india"};
		
		for(int i=0;i<a.length;i++) {
			String s="";
			s=a[i];
			LinkedHashSet<Character> lhs=new LinkedHashSet<>();

			for(int j=0;j<s.length();j++) {
				
				lhs.add(s.charAt(j));
			}
			int count=0;
			for (Character character : lhs) {
				
				if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u') {
					count++;
				}
			}
			System.out.println(s+"   vowel    "+count);
		}
	}}

	
