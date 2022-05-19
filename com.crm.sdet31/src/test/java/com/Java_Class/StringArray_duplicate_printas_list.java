package com.Java_Class;

import java.util.LinkedHashSet;

public class StringArray_duplicate_printas_list {

		public static void main(String[] args) {
			
			String s="Tester";
			s=s.toLowerCase();
			LinkedHashSet<Character> lhs=new LinkedHashSet<>();
			for(int i=0;i<s.length();i++) {
				lhs.add(s.charAt(i));
			}
			
			for (Character character : lhs) 
			
			{
				for(int j=s.length()-1;j>=0;j--) 
				{
					if(character==s.charAt(j)) 
					{
						System.out.println(character+":"+ (j+1));
						break;
					}
					
				}
			}
}}
