package com.reverse_String;

public class Reverse_the_wordcharacter_in_every_string_array_cell_string {
	
	public static void main(ReverseString[] args) {
		
		String s="khatam ta ta bye bye";
		String[] as = s.split(" ");
		
		for (int i = 0; i < as.length; i++) {
			
			String s1=as[i];
			//System.out.println(s1);
			String rev="";
			for (int j = s1.length()-1; j >=0; j--) {
				rev=rev+s1.charAt(j);
			}
			System.out.print(rev+" ");	

		}
		
		
		
	}

}

