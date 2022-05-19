package com.reverse_String;

public class PrintAstringAscharacter {

		public static void main(ReverseString[] args) {
			
			String s= "Testyantra";
			
			for(int i=s.length()-1;i>=0;i--)
			{
				System.out.println(s.charAt(s.length()-1-i));
			}
		}
}
