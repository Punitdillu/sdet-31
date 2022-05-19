package com.Java_Class;

public class Convert_A_Number__ToArray {
	public static void main(String[] args) {
		
		int num=1234;
		int temp=num;
		int count=0;
		int n=1;
		
		
		while(temp>0) 
		{
			temp=temp/10;
			count++;
		}
		int a[]=new int[count];
		for(int i=0;i<count;i++)
		{
			a[i]=num%10;
			num=num/10;
		}
		for(int i=a.length-1;i>=0;i-- ) {
			for(int j=a.length-1;j>=0;j--) {
			
			System.out.print((a[j]*n+" "));
		}
			n=n*10+1;
		System.out.println();}
		}
	}


