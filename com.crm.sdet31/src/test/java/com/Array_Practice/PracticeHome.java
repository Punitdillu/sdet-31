package com.Array_Practice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PracticeHome {
	
	
	
	public static void main(String[] args) 

	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		
		String s=sc.nextLine();
		System.out.println("string value is : "+ s);
		
		
		String[] a = s.split(" ");
		int r=4;
		
		for (int i=0;i<a.length;i++) {
			
			String str = a[i];
			int d=str.length()-1;
			
			for(int j=0;j<str.length();j++) {
				
				if(i==r) {
					
					char c=str.charAt(d);
					d--;
					System.out.print(c);
					
				}
				
			}
			if(i!=r) {
				System.out.print(" "+a[i]+" ");
			}
			
			
		}

	}
	
	

}
