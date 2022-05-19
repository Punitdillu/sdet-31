package com.Java_Class;

public class Array_sagrigation_1 {
	
	public static void main(String[] args) 
	{
		int a=7;
		int b=3;
		int arr[]= {a,b,b,a,b,a,a,b,a,a};
		int b1[]=new int[arr.length];
		int one=0;
		int zero=arr.length-1;
		for(int i=0;i<arr.length;i++ )
		{
		if(arr[i]==a) {
			
			b1[one]=arr[i];
			one++;
		}
		else {
			b1[zero]=arr[i];
			zero--;
		}
			
		}
		for(int i=0;i<b1.length;i++) {
			
			System.out.print(b1[i]+" ");
		}
		
	}

}
