package com.reverse_String;

import java.util.LinkedHashSet;

public class Occurance_of_word_in_string {

		public static void main(ReverseString[] args) {
			
			String s="Today is good day and tomorrow will be also a good day";
			String[] ch = s.split(" ");
			
			LinkedHashSet<String> lhs = new LinkedHashSet<String>();
			
			for (int i = 0; i < ch.length; i++) {
			
				lhs.add(ch[i]);}
				for (String string : lhs) 
				 {
						int count=0;
						for (int j = 0; j < ch.length; j++) {
							
							if(string.equals(ch[j])) {
								count++;
							}
						}
						System.out.println(string+" is present "+count);
				}
		}
}
