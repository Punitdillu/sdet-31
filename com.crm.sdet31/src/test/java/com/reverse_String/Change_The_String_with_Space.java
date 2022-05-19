package com.reverse_String;

public class Change_The_String_with_Space {
	
		public static void main(ReverseString[] args) {
			
			String s="Alldayisgoodday";
			for (int i = 0; i < s.length(); i++) {
				
				if(i==2||i==5||i==7||i==11)
				{
					System.out.print(s.replace("l"," "));
				}
				
			}
			
			
		}
}
