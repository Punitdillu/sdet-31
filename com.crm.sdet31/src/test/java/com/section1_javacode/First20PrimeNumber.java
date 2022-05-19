package com.section1_javacode;

public class First20PrimeNumber {

		public static void main(String[] args) {
			
			int num=2;
			int totalprimenum=0;
			while(totalprimenum<=1000000000) 
			{
			int count=0;
		for(int i=1;i<=num;i++) 
		{
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(num+" ");
			totalprimenum++;
		}
		num++;
		
		}
		}
	}
		

