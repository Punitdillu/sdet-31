package com.Java_Class;

public class Add_Two_Arrays {
	public static void main(String[] args) {
		
		int a[]= {2,3,5,6,4,2,1};
		int b[]= {2,5,4,6,2,1,5,8,6,9,5,4,6};
		int count=a.length;
		if(a.length<b.length)
		{
			count=b.length;
		}
		for(int i=0;i<count;i++)
		{
			try {
				System.out.println(a[i]+b[i]);
			}
			catch(Exception e){
				
				if(a.length>b.length) {
					
					System.out.println(a[i]);
				}
				else {
					
					System.out.println(b[i]);
				}
			}
		}
		
	}
}
