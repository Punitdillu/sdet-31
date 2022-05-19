package com.Java_Class;

import java.util.LinkedHashSet;

public class Tester {
	public static void main(String[] args) {
		
		String s="mahabharat";
		s=s.toLowerCase();
		
		LinkedHashSet<Character> lhs= new LinkedHashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) 
		{
		
				lhs.add(s.charAt(i));
		}
		
		for (Character character : lhs) {
			
		
			
				System.out.println(s.lastIndexOf(character)+1);
				}
			}
		}
	


