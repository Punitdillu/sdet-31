package com.section1_javacode;

public class PrintSimilarElement {

		public static void main(String[] args) {
			
			String s="abc@$RqT*&^";
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)>='A' && s.charAt(i)<='z')
				{
//					System.out.print(s.charAt(i));
				}
				else {
					System.out.print(s.charAt(i));
				}
				
				
			}
		}
		}
