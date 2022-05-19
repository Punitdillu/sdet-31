package com.reverse_String;

import org.apache.poi.util.SystemOutLogger;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s="punitranjan";
		int count=0;
		String s1="";
		int j=0;
		char[] a = s.toCharArray();
		for (char c : a) {
			count++;
		}
		System.out.println(count);
		
		for(int i=count-1;i>=0;i--) {
			
			s1=s1+s.charAt(i);
			
		}
		System.out.println(s1);
		
	

}}
