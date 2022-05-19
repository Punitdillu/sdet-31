package com.reverse_String;

public class KhatamTata {
	public static void main(ReverseString[] args) {
		
		
		String s="khatam tata bye bye";
		String []a=s.split(" ");
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++) {
				
				if(a[i].equals(a[j])) {
					
					if(i>j) {
						break;
					}
					else {
						count++;
					}
				}
			}
			if(count>0) {
				System.out.println(a[i]+"  present "+count+" times");
			}
		}
	}

}
