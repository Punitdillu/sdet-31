package com.reverse_String;


public class RevofStringchararray {
public static void main(ReverseString[] args) {
	
		String s="malyalam";
		
			char[] s1 = s.toCharArray();
			int count=0;
			
		
			for ( char c : s1) {
			count++;
		}
			char[] s2=new char[count];
			
			for(int i=count-1;i>=0;i--)
			{
					s2[i]=(char) (s2[i]+s1[i]);
				System.out.print(s2[i]);
			}
}
}
