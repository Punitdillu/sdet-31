package com.Array_Practice;

public class StringfirstLetterCapital {

		public static void main(String[] args) {
			
			String a="my name is savita";
			String[] s = a.split(" ");
			for (String str : s) {
				for (int i = 0; i < str.length(); i++) {
					
					if(i==0) {
						
						char c = (char)(str.charAt(i)-32);
						System.out.print(c);
						
						
					}
					else {
						System.out.print(str.charAt(i));
					}
				}
//				String str1=str.substring(0, 1).toUpperCase()+str.substring(1);
//				System.out.print(str1+" ");
				System.out.print("");
			}
		}
}
